package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dao.IUpdateDao;
import in.ineuron.dao.UpdateDaoImpl;
import in.ineuron.dto.Customer;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String uid = request.getParameter("UId");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String accType = request.getParameter("accType");
        String balance = request.getParameter("balance");
        String adhar = request.getParameter("adhar");
        String pan = request.getParameter("pan"); 
        String transactions = request.getParameter("transactions");
        
        IUpdateDao dao = new UpdateDaoImpl();
        
        Customer customer = new Customer();
        
         customer.setUId(uid);
         customer.setName(name);
         customer.setAge(Integer.parseInt(age));
         customer.setEmail(email);
         customer.setMobile(mobile);
         customer.setAddress(address);
         customer.setAccType(accType);
         customer.setBalance(balance);
         customer.setAdhar(adhar);
         customer.setPan(pan);
         customer.setTransactions(transactions);
         
         String status = dao.insert(customer);

 		PrintWriter out = response.getWriter();
 		out.println("<html>");
 		out.println("<head>");
 		out.println("<title>Output</title>");
 		out.println("<style>");
 		out.println("body {");
 		out.println("  font-family: Arial, sans-serif;");
 		out.println("  background-color: #ee82ee;");
 		out.println("}");
 		out.println("table {");
 		out.println("  border-collapse: collapse;");
 		out.println("  margin: auto;");
 		out.println("}");
 		out.println("th, td {");
 		out.println("  border: 1px solid #555;");
 		out.println("  padding: 8px;");
 		out.println("}");
 		out.println("th {");
 		out.println("  background-color: lightgreen;");
 		out.println("  color: #fff;");
 		out.println("}");
 		out.println("h1 {");
 		out.println("  color: #0000ff;");
 		out.println("  text-align: center;");
 		out.println("}");
 		out.println("</style>");
 		out.println("</head>");
 		out.println("<body>");
 		out.println("<center>");
 		out.println("<h1>Final Updated Record</h1>");
 		out.println("<table>");
 		out.println("<tr><th>UId</th><td>" + uid + "</td></tr>");
 		out.println("<tr><th>NAME</th><td>" + name + "</td></tr>");
 		out.println("<tr><th>AGE</th><td>" + age + "</td></tr>");
 		out.println("<tr><th>EMAIL</th><td>" + email + "</td></tr>");
 		out.println("<tr><th>MOBILE</th><td>" + mobile + "</td></tr>");
 		out.println("<tr><th>ADDRESS</th><td>" + address + "</td></tr>");
 		out.println("<tr><th>ACCTYPE</th><td>" + accType + "</td></tr>");
 		out.println("<tr><th>BALANCE</th><td>" + balance + "</td></tr>");
 		out.println("<tr><th>ADHAR</th><td>" + adhar + "</td></tr>");
 		out.println("<tr><th>PAN</th><td>" + pan + "</td></tr>");
 		out.println("<tr><th>TRANSACTIONS</th><td>" + transactions + "</td></tr>");
 		out.println("<tr><th>STATUS</th><td>" + status + "</td></tr>");
 		out.println("</table>");
 		out.println("</center>");
 		out.println("</body>");
 		out.println("</html>");

		
         
 		out.close();
         
         
	}

}
