<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer List</title>
    <style>
  table {
  border-collapse: collapse;
  width: 95%;
}

th, td {
  padding: 5px;
  text-align: center;
}

th {
  background-color: lightBlue;
}

td {
   background-color: grey;
  border: 2px solid black;
}

td.highlight {
  background-color: yellow;
  font-weight: bold;
}
a:hover {
    background-color: tomato;
  }
      
    </style>
    
    
</head>
<%@include file="reuseable_files/css.jsp"%>
<body>
 <%@include file="reuseable_files/navbar.jsp"%>
<form>
    <h1>Customer List:-</h1>
    <table border='1'>
        <tr>
            <th>UId</th>
            <th>Name</th>
            <th>Age</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Address</th>
            <th>Account Type</th>
            <th>Balance</th>
            <th>Adhar</th>
            <th>PAN</th>
            <th>Transactions</th>
        </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td>${customer.UId}</td>
                <td>${customer.name}</td>
                <td>${customer.age}</td>
                <td>${customer.email}</td>
                <td>${customer.mobile}</td>
                <td>${customer.address}</td>
                <td>${customer.accType}</td>
                <td>${customer.balance}</td>
                <td>${customer.adhar}</td>
                <td>${customer.pan}</td>
                <td>${customer.transactions}</td>
            </tr>
            <td><a href="edit.jsp?UId=${customer.UId}&name=${customer.name}&age=${customer.age}&email=${customer.email}
            &mobile=${customer.mobile}&address=${customer.address}&accType=${customer.accType}&balance=${customer.balance}&adhar=${customer.adhar}
            &pan=${customer.pan}&transactions=${customer.transactions}&prevPage=customer.jsp">Edit</a>
</td>
                   <td><a href="message.jsp?UId=${customer.UId}&name=${customer.name}&prevPage=customer.jsp">Send Notification</a>
</td>
            
        </c:forEach>
    </table>
    </form>
</body>
</html>

