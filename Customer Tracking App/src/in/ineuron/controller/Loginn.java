package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.ineuron.dao.LoginDaoImpl;
import in.ineuron.dao.LoginDao;
import in.ineuron.dto.Login;


public class Loginn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		

       LoginDao dao = new LoginDaoImpl();
		
       Login login = new Login();
		login.setName(name);
		login.setPass(pass);
		
		String status = dao.select(login);

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Output</title></head>");
		out.println("<body style='bg-color: #F5F5F5; color:lightgreen; text-align:center;'>");  
    	out.println("<center>");
		out.println("<tr><th>STATUS:-</th><td>" + status + "</td></tr>");
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		 RequestDispatcher rd = request.getRequestDispatcher("./Aaccess.jsp");
		 rd.forward(request, response);
		 
		out.close();
		
			
	}
}
