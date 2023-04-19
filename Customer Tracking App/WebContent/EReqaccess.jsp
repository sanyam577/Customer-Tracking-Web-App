<!DOCTYPE html>
<html>
<head>
	<title>My JSP Page</title>
	
</head>
    <style>
    body {
        background-image: url("images/bank113.jpg");
        background-repeat: no-repeat;
        background-size: cover; 
         
       } 
    
</style>

<%@include file="reuseable_files/css.jsp"%>
<body>
<center>
 <%@include file="reuseable_files/navbar.jsp"%>
     <br/> <br/> <br/> <br/> 
	<h1 style='color: red; text-align: center; font-weight: bold;'>Welcome to employee portal</h1>
	
	<%
		if (request.getParameter("sendRequest") != null) {
			String name = request.getParameter("name");
			
			// Set the name and password as attributes of the request object
			request.setAttribute("name", name);
			
			// Forward the request to the "req.jsp" page
			request.getRequestDispatcher("/req.jsp").forward(request, response);
		}
	%>
	
	<form action="req.jsp" method="post">
		<table>
			<tr>
				<td>Wants to send request as:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="sendRequest" value="Send Request"></td>
			</tr>
		</table>		
	</form>
	</center>
</body>
</html>


