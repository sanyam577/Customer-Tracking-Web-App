package in.ineuron.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageBoxDAOImpl implements IMessageBoxDAO {

    private static final String INSERT_MESSAGE = "INSERT INTO messagebox (UId, name, message) VALUES (?, ?, ?)";

    @Override
    public boolean sendMessage(String message, String UId, String name) {
        Connection connection = null;
        PreparedStatement statement = null;
        boolean messageSent = false;

        try {
        	 Class.forName("com.mysql.cj.jdbc.Driver");
 	        connection = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Kalhans8400@");
            statement = connection.prepareStatement(INSERT_MESSAGE);
            statement.setString(1, UId);
            statement.setString(2, name);
            statement.setString(3, message);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                messageSent = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return messageSent;
    }

}

