<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Results</title>
</head>
<body>
    <h1>Login Results</h1>
    <% 
        String name = request.getParameter("name");
       
        
        // Set the name and password as attributes of the request object
        request.setAttribute("name", name);
       
        
        // Forward the request to the LoginResultServlet
        request.getRequestDispatcher("/check").forward(request, response);  
    %>
</body>
</html>
