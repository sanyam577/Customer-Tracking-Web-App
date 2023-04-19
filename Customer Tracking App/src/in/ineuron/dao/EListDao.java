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
import in.ineuron.dto.EListDto;


public class EListDao{


	    public List<EListDto> getAllEmployees() throws SQLException {
	    	
	        List<EListDto> requestList = new ArrayList<>();
	        System.out.println("In EListDao");
	        
	        try (Connection connection = DriverManager.getConnection("jdbc:mysql:///bank", "root", "Kalhans8400@")) {
	            String sql = "SELECT name, hasaccesstoadmin FROM employee";
	            try (Statement statement = connection.createStatement();
	                 ResultSet resultSet = statement.executeQuery(sql)) {
	                while (resultSet.next()) {
	                	
	                    EListDto request = new EListDto();
	                    
	                    
	                    request.setName(resultSet.getString("name"));
	                    request.setHasaccesstoadmin(resultSet.getBoolean("hasaccesstoadmin"));
	                    requestList.add(request);
	                }
	            }
	        }
	        return requestList;
	    }
	    
	    
}
