    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
		body {
			background-image: url("images/bank118.jpg");
			background-size: cover;
			background-position: center;
			display: flex;
			flex-direction: column;
			height: 100vh;
			margin: 30;
		}
	</style>
	
</head>


<%@include file="reuseable_files/css.jsp"%>
<body bgcolor="lightgreen">
	<center>
        <%@include file="reuseable_files/navbar.jsp"%>
		<h1 style='color: red; text-align: center; font-weight: bold;'>WELCOME TO SS BANK</h1>
		<h2 style='color: blue; text-align: center;'>EMPLOYEE
			LOGIN PAGE</h2>
		<form method="post" action='./login2'>
			<table>
				<tr>
					<td>NAME</td>
					<td><input type='text' name='name' /></td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td><input type='password' name='pass' /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type='submit' value='submit' /></td>
				</tr>
			</table>
		</form>
	</center>
	
	<% 
	    String name = request.getParameter("name");

	    if (name != null) {
	        // Set the name and password as attributes of the request object
	        request.setAttribute("name", name);
	       
	        
	        // Forward the request to the loginresult.jsp page
	        request.getRequestDispatcher("/EReqaccess.jsp").forward(request, response);
	    }
	%>
	
</body>
</html>


