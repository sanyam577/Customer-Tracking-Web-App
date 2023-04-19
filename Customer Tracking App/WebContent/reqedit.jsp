<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Give Access To Employee</title>
    
     <style>
        body {
            background-image: url("images/bank4.jpg");
            background-size: cover;
            background-position: center;
            display: flex;
            justify-content: center;
            
            height: 100vh;
        }
        h1 {
            color: blue;
            text-align: center;
            font-weight:bold;
        }
        table {
        
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 10px;
        }
    </style>
</head>
<body>
   <center>
    <br/><br/> <br/><br/> <br/><br/><br/>
    <h1>Give Access To Employee</h1>
    <br/><br/>
    <form method="post" action="updateRequest.jsp">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value="${param.name}" value="${fixedName}" readonly ></td>
            </tr>
           <tr>
              <td>Give Access:</td>
                <td>
               <label>
                  <input type="radio" name="hasaccesstoadmin" value="true" ${param.hasaccesstoadmin == "true" ? "checked" : ""}> Yes
               </label>
               <label>
                  <input type="radio" name="hasaccesstoadmin" value="false" ${param.hasaccesstoadmin == "false" ? "checked" : ""}> No
                </label>
                 </td>
            </tr>

            <tr>
                <td><input type="submit" value="Update"></td>
                <td><a href="./elist">Cancel</a></td>
            </tr>
        </table>
    </form>
    </center>
</body>
</html>
