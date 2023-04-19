<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@include file="reuseable_files/css.jsp"%>

<style type="text/css">
.bg-img {
  background: url("images/mybank.jpeg");
  height: 80vh;
  width: 100%;
  animation: flow 12s ease-in-out infinite;
}

@keyframes flow {
  0% {
    background-position: 0 0;
  }
  50% {
    background-position: 100% 0;
  }
  100% {
    background-position: 0 0;
  }
}

 
</style>
</head>


<body style="background-color:#095a79   ">
	<%@include file="reuseable_files/navbar.jsp"%>
	<div class='container-fluid bg-img'>
		<h1 class="text-center text-danger">Welcome To</h1>
	</div>
	<hr>
	

 
 <%@include file="reuseable_files/footer.jsp" %>
 
</body>
</html>