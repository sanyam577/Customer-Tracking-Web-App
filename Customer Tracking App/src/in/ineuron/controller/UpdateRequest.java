package in.ineuron.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dao.IUpdateRequestDao;
import in.ineuron.dao.UpdateRequestDaoImpl;
import in.ineuron.dto.EListDto;


public class UpdateRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("name");
	     boolean hasaccesstoadmin = Boolean.parseBoolean(request.getParameter("hasaccesstoadmin"));
	     
	        EListDto list = new EListDto();
	          list.setName(name);
	          list.setHasaccesstoadmin(hasaccesstoadmin);
	        
	        IUpdateRequestDao dao = new UpdateRequestDaoImpl();
	        
	        
	        
	        int rowsAffected = dao.update(list);
	        response.setContentType("text/html");
	        response.getWriter().write("<p style='text-align:center; bgcolor: lightgreen; font-size: 24px;'>" + rowsAffected +")"+  name + " Check Your Portal</p>");


	}

}
