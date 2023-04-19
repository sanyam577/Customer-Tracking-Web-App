package in.ineuron.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.ineuron.dto.Customer;

public class UpdateDaoImpl implements IUpdateDao{
	
	private static final String SQL_UPDATE_QUERY = "UPDATE customer SET name=?, age=?, email=?, mobile=?, address=?, accType=?, balance=?, adhar=?, pan=?, transactions=? WHERE UId=?";

	@Override
	public String insert(Customer customer) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		String status = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Kalhans8400@");
			if (connection != null)
				pstmt = connection.prepareStatement(SQL_UPDATE_QUERY);
			if (pstmt != null) {
				
			
	            pstmt.setString(1, customer.getName());
	            pstmt.setInt(2, customer.getAge());
	            pstmt.setString(3, customer.getEmail());
	            pstmt.setString(4, customer.getMobile());
	            pstmt.setString(5, customer.getAddress());
	            pstmt.setString(6, customer.getAccType());
	            pstmt.setString(7, customer.getBalance());
	            pstmt.setString(8, customer.getAdhar());
	            pstmt.setString(9, customer.getPan());
	            pstmt.setString(10, customer.getTransactions());
	            pstmt.setString(11, customer.getUId());
	           

				int rowCount = pstmt.executeUpdate();
				if (rowCount>=1) {
					status = "success";
				} else {
					status = "failure";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return status;
	}

}
