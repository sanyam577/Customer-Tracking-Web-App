package in.ineuron.filter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import in.ineuron.dao.ELoginDaoImpl;
import in.ineuron.dto.ELogin;




public class EValidation implements Filter {
	
	private ELoginDaoImpl loginDaoImpl;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		loginDaoImpl = new ELoginDaoImpl();
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String pass_err_msg = "Incorrect password", name_err_msg = "incorrect username ";
		

		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		ELogin login = new ELogin();
		login.setName(name);
		login.setPass(pass);

		String status = loginDaoImpl.select(login);

		if (status.equals("successful login")) {
			chain.doFilter(request, response);
		} 

          else {
			out.println("<html><head><title>Output</title></head>");
			out.println("<body bgcolor='lightgreen'>");
			out.println("<center>");
			out.println("<h1 style='color:red; text-align:center;'>User Registration Details</h1>");
			out.println("<form method='post' action='./login2'>");
			out.println("<table>");
			out.println("<tr><th>NAME</th><td><input type='text' name ='name' value='" + name + "'/></td><td><font color='red' size ='5'>"
					+ name_err_msg + "</font></td></tr>");
			out.println("<tr><th>PASSWORD</th><td><input type='password' name ='pass' value='" + pass + "'/></td><td> <font color='red' size ='5'>"
					+ pass_err_msg + "</font></td></tr>");
			out.println("<tr><td></td><td><input type='submit' value='login'/></td></tr>");
			out.println("</table>");
			out.println("</form>");
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
		}

	}

	public void destroy() {
		loginDaoImpl = null;
	}

}

