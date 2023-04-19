<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Request List</title>
    <style>
		body {
			background-image: url("images/bank3.jpg");
			background-size: cover;
			background-position: center;
			
			height: 100vh;
			margin: 30;
		}
		 table {
    border-collapse: collapse;
    width: 100%;
  }
  
  th, td {
    padding: 5px;
    text-align: left;
    border: 1px solid #ddd;
  }
  
  th {
    background-color: lightgreen;
    color: #333;
  }
  
  tr:nth-child(even) {
    background-color: #f2f2f2;
  }
  
  tr:hover {
    background-color: grey;
  }
  
  

	</style>
    
</head>
<%@include file="reuseable_files/css.jsp"%>
<body>
 <center>
    <%@include file="reuseable_files/navbar.jsp"%>
<form>
     <br/><br/>
    <h1 style="color: rgb(235, 134, 40); font-weight:bold";>Request List</h1>
    <table border='2'>
        <tr>
            <th>Name</th>
            <th>HasAccess</th>
              
        </tr>
        <c:forEach var="request" items="${requestList}">
            <tr>
                <td>${request.name}</td>
                <td>${request.hasaccesstoadmin}</td>   
            </tr>
         <td><a href="reqedit.jsp?name=${request.name}&hasaccesstoadmin=${request.hasaccesstoadmin}
            &prevPage=eList.jsp">Edit</a>
            </td> 
 
            
        </c:forEach>
    </table>
    </form>
    </center>
</body>
</html>

