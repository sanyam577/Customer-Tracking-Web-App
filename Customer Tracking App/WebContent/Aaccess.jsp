<!DOCTYPE html>
<html>
<head>
	<title>My JSP Page</title>
	<style>
		body {
			background-image: url("images/bank123.jpeg");
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
<body>
    <center>
    <%@include file="reuseable_files/navbar.jsp"%>
    <br/><br/><br/><br/><br/><br/>
	<h1 style='color: magenta; font-weight:bold'>Welcome to Admin Portal</h1>
	<br/><br/>
	<form action="elist" method="post">
		<input type="submit" name="fetchRequest" value="Fetch Request">		
	</form>
	<br/>
	<form action="reg" method="post">
		<input type="submit" name="fetchCustomerList" value="Customer List">
	</form>
	</center>
</body>
</html>
