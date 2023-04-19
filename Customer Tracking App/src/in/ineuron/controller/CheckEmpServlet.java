package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dao.CheckEmpDao;


public class CheckEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    String name = request.getParameter("name");
	    CheckEmpDao dao = new CheckEmpDao(); // Create an instance of your DAO class
	    
	    boolean hasAccessToAdmin = dao.getHasAccessToAdmin(name); // Call DAO method to fetch boolean value
	    
	    if (hasAccessToAdmin) {
	      RequestDispatcher rd = request.getRequestDispatcher("./reg");
	      rd.forward(request, response); // Forward to customer.jsp if boolean value is true
	    } else {
	      PrintWriter out = response.getWriter();
	      out.println("<p style='font-size: 25px; text-align: center; background-color: skyBlue; padding: 10px;'>Please wait</p>");
 
	    }
	    
	  }

}
