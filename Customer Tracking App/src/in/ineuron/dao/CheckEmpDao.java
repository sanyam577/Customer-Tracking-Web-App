package in.ineuron.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckEmpDao {

	
	  public boolean getHasAccessToAdmin(String name) {
		    
		    boolean hasAccessToAdmin = false;
		    
		    Connection conn = null;
		    PreparedStatement stmt = null;
		    ResultSet rs = null;
		    
		    try {
		      
		      // Register JDBC driver
		      Class.forName("com.mysql.cj.jdbc.Driver");

		      // Open a connection
		      conn = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Kalhans8400@");

		      // Execute a query
		      String sql = "SELECT hasaccesstoadmin FROM employee WHERE name=?";
		      stmt = conn.prepareStatement(sql);
		      stmt.setString(1, name);
		      rs = stmt.executeQuery();

		      // Extract data from result set
		      if (rs.next()) {
		        hasAccessToAdmin = rs.getBoolean("hasaccesstoadmin");
		      }
		      
		    } catch (SQLException se) {
		      se.printStackTrace();
		    } catch (Exception e) {
		      e.printStackTrace();
		    } finally {
		      // Close resources
		      try {
		        if (rs != null) rs.close();
		      } catch (SQLException se) {}
		      try {
		        if (stmt != null) stmt.close();
		      } catch (SQLException se) {}
		      try {
		        if (conn != null) conn.close();
		      } catch (SQLException se) {}
		    }
		    
		    return hasAccessToAdmin;
		    
		  }
}
