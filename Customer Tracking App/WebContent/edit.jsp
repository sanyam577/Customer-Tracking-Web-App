<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Edit Customer Details</title>
    <style>
    body {
        background-image: url("images/bank6.jpg");
        background-repeat: no-repeat;
        background-size: cover;
    }
    
   
.customer-table {
  border-collapse: collapse;
  margin: auto;
  width: 50%;
}

.customer-table td,
.customer-table th {
  border: 1px solid #ddd;
  padding: 2px;
  text-align: left;
  background-color: skyBlue;
}


.customer-table input[type=text] {
  width: 100%;
  padding: 4px 4px;
  margin: 2px 0;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  background-color: skyBlue;
}

.customer-table input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 4px 4px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.customer-table input[type=submit]:hover {
  background-color: #45a049;
}

.customer-table a {
  background-color: #f44336;
  color: white;
  padding: 4px 4px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.customer-table a:hover {
  background-color: #d32f2f;
}

    
    
</style>
    
</head>
<body>
<center>
    <div >
  <h1 style="background-color: #ccc;">Edit Customer Details</h1>
</div>
    <form method="post" action="updateCustomer.jsp">
        <table class="customer-table">
            <tr>
                <td>UId:</td>
                <td><input type="text" name="UId" value="${param.UId}" value="${fixedUId}" readonly ></td>
            </tr>
            <tr>
                <td>Name:</td>
               <td><input type="text" name="name" value="${param.name}" ></td>
            </tr>
            <tr>
                <td>Age:</td>
               <td><input type="text" name="age" value="${param.age}" ></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" value="${param.email}" ></td>
            </tr>
            <tr>
                <td>Mobile:</td>
                <td><input type="text" name="mobile" value="${param.mobile}" ></td>
            </tr>
            <tr>
                <td>Address:</td>
               <td><input type="text" name="address" value="${param.address}" ></td>
            </tr>
            <tr>
                <td>Account Type:</td>
                <td><input type="text" name="accType" value="${param.accType}" ></td>
            </tr>
            <tr>
                <td>Balance:</td>
               <td><input type="text" name="balance" value="${param.balance}" ></td>
            </tr>
            <tr>
                <td>Adhar:</td>
              <td><input type="text" name="adhar" value="${param.adhar}" ></td>
            </tr>
            <tr>
                <td>PAN:</td>
                <td><input type="text" name="pan" value="${param.pan}" ></td>
            </tr>
            <tr>
             <tr>
                <td>Transactions:</td>
                <td><input type="text" name="transactions" value="${param.transactions}" value="${fixedUId}" readonly></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><a href="./reg">Cancel</a></td>
            </tr>
        </table>
    </form>
    </center>
</body>
</html>
