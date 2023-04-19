<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Customer Details</title>
</head>
<body>
    <%
    // Get the updated customer data from the request parameters
    String UId = request.getParameter("UId");
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

    // Set the updated customer data as attributes in the request object
    request.setAttribute("UId", UId);
    request.setAttribute("name", name);
    request.setAttribute("age", age);
    request.setAttribute("email", email);
    request.setAttribute("mobile", mobile);
    request.setAttribute("address", address);
    request.setAttribute("accType", accType);
    request.setAttribute("balance", balance);
    request.setAttribute("adhar", adhar);
    request.setAttribute("pan", pan);
    request.setAttribute("transactions", transactions);

    // Forward the request to the servlet
    request.getRequestDispatcher("./update").forward(request, response);
    %>
</body>
</html>

