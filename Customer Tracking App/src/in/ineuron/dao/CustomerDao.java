package in.ineuron.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.ineuron.dto.Customer;


public class CustomerDao{


	    public List<Customer> getAllCustomers() throws SQLException {
	    	
	        List<Customer> customerList = new ArrayList<>();
	        
	        System.out.println("In Customer.Dao");
	        
	        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Kalhans8400@")) {
	            String sql = "SELECT UId, name, age, email, mobile, address, accType, balance, adhar, pan, transactions FROM customer";
	            try (Statement statement = connection.createStatement();
	                 ResultSet resultSet = statement.executeQuery(sql)) {
	                while (resultSet.next()) {
	                	
	                    Customer customer = new Customer();
	                    
	                    customer.setUId(resultSet.getString("UId"));
	                    customer.setName(resultSet.getString("name"));
	                    customer.setAge(resultSet.getInt("age"));
	                    customer.setEmail(resultSet.getString("email"));
	                    customer.setMobile(resultSet.getString("mobile"));
	                    customer.setAddress(resultSet.getString("address"));
	                    customer.setAccType(resultSet.getString("accType"));
	                    customer.setBalance(resultSet.getString("balance"));
	                    customer.setAdhar(resultSet.getString("adhar"));
	                    customer.setPan(resultSet.getString("pan"));
	                    customer.setTransactions(resultSet.getString("transactions"));
	                    customerList.add(customer);
	                }
	            }
	        }
	        return customerList;
	    }
	    
	    
}
