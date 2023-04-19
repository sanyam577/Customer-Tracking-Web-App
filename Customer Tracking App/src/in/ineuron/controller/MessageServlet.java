package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dao.IMessageBoxDAO;
import in.ineuron.dao.MessageBoxDAOImpl;


public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        String message = request.getParameter("message");
	        String UId = request.getParameter("UId");
	        String name = request.getParameter("name");
	        
	         IMessageBoxDAO customerDAO = new MessageBoxDAOImpl(); 
	        // Pass the message, customerId and name to the DAO
	        boolean messageSent = customerDAO.sendMessage(message, UId, name);
	        
	         PrintWriter out = response.getWriter();
	        
	         if (messageSent) {
	        	    out.println("<p style='font-size: 25px; text-align: center; background-color: skyblue; padding: 10px;'>Message sent successfully</p>");
	        	} else {
	        	    out.println("<p style='font-size: 25px; text-align: center; background-color: red; padding: 10px;'>Failed to Send Message</p>");
	        	}


	  }}