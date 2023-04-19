package in.ineuron.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.dto.EListDto;

public class UpdateRequestDaoImpl implements IUpdateRequestDao{

	@Override
	public int update(EListDto list) {
		  int rowsAffected = 0;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Kalhans8400@");
	            String sql = "UPDATE employee SET hasaccesstoadmin = ? WHERE name = ?";
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            stmt.setBoolean(1, list.isHasaccesstoadmin());
	            stmt.setString(2, list.getName());
	            rowsAffected = stmt.executeUpdate();
	            stmt.close();
	            conn.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	        return rowsAffected;
	    }
	}


