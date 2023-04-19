package in.ineuron.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dao.EListDao;
import in.ineuron.dto.EListDto;


public class EListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In CustomerListServlet");
		try {
	            EListDao requestDAO = new EListDao();
	            
	            List<EListDto> requestList = requestDAO.getAllEmployees();
	            
	            request.setAttribute("requestList", requestList);
	            request.getRequestDispatcher("eList.jsp").forward(request, response);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            response.getWriter().append("Error: " + e.getMessage());
	        }
	    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
