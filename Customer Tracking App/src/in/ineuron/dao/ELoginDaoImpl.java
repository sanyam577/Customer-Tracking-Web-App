package in.ineuron.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.dto.ELogin;





public class ELoginDaoImpl implements ELoginDao{

	private static final String SQLSELECTQUERY = "SELECT pass, name FROM employee WHERE pass=? AND name=?";

	@Override
	public String select(ELogin login) {

	    Connection connection = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    String status = null;
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        connection = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Kalhans8400@");
	        if (connection != null)
	            pstmt = connection.prepareStatement(SQLSELECTQUERY);
	        if (pstmt != null) {
	            pstmt.setString(1, login.getPass());
	            pstmt.setString(2, login.getName());

	            rs = pstmt.executeQuery();
	            if (rs.next()) {
	                status = "successful login";
         

	            } else {
	                status = "Invalid login details";
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) {
	                rs.close();
	            }
	            if (pstmt != null) {
	                pstmt.close();
	            }
	            if (connection != null) {
	                connection.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return status;
	}
}