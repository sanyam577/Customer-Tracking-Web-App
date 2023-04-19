<!DOCTYPE html>
<html>
<head>
	<title>Send Message to Customers</title>
</head>
    <style>
    body {
        background-image: url("images/bank111.jpg");
        background-repeat: no-repeat;
        background-size: cover; 
         
       }
    
  
    
    
</style>

<%@include file="reuseable_files/css.jsp"%>
<body>
<center>
 <%@include file="reuseable_files/navbar.jsp"%>
	<h1 style="background-color: #ccc;">Send Message to Customers</h1>
	<form action="./message" method="POST">
	       <tr> 
	       <br/><br/><br/><br/>
                <td>UId:</td>
                <td><input type="text" name="UId" value="${param.UId}" value="${fixedUId}" readonly ></td>
            </tr> 
            <tr>
                <td>Name:</td>
               <td><input type="text" name="name" value="${param.name}" value="${fixedUId}" readonly></td>
            </tr>
		<label for="message">Enter your message:</label>
		<input type="text" name="message" id="message" required><br><br>
		<input type="submit" value="Send Message">
	</form>
	<br>
	</center>
</body>
</html>
