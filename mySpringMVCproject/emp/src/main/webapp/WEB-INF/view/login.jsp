<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<%
	String errMessage = (String) request.getAttribute("errPswMsg");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous" />
<link rel="stylesheet" type="text/css" href="/css/style.css" />
<link rel="stylesheet" type="text/css" href="/css/login.css" />
</head>
<body style="line-height: normal">
	<ul class="header">

		<li
			style="float: left; font-size: 27px; top: 0px; color: #fff; padding: 16px;">E
			M P</li>
		<a href="./login"><img
			style="float: left; float: left; padding: 4px; height: max-content;"
			src="/img/favicon.ico">
			<li
			style="float: left; font-size: 25px; top: 0px; color: #fff; padding: 16px;">Employee
				Managment Portal</li></a>

	</ul>
	<!-- <div class="alert alert-warning alert-dismissible fade show" role="alert"> -->
	<span
		style="color: red; top: 137px; left: 617px; font-size: 16px; font-family: cursive; position: absolute;">
		<%
			if (errMessage != null) {
		%> <%=errMessage%> <%
 	}
 %>
	</span>

	<!-- <button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">&times;</span>
  </button> -->
	</div>

	<div class="logdiv">
		<center>
			<h2 style="color: #fff; height: auto;">Login</h2>
		</center>
		<form method="POST" action="./submitForm"
			style="background-color: #fff">

			<div class="container">
				<br> <label for="username"><b>Emp Id</b></label> <input
					type="text" placeholder="Enter Username" name="empId"
					required="required"> <br> <br> <label
					for="password"><b>Password</b></label> <input type="password"
					id="password" onkeyup="validateForm()" placeholder="Enter Password"
					name="password" required="required"> <i class="fa fa-eye"
					style="position: absolute; right: 25px; top: 234px;"
					onclick="showPassword()" aria-hidden="true"></i> <br> <br>
				<button type="submit" name="login">Login</button>
				<br> <br> <a href="empRegister.jsp">Create Account</a> <a
					href="forgetPassword.html" style="float: right;">Forget
					Password</a>
			</div>

		</form>
	</div>
	<div style="text-align: right; margin-right: 10px;"
		class="navbar navbar-default navbar-fixed-bottom"></div>

	<script src="/js/validation.js"></script>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>