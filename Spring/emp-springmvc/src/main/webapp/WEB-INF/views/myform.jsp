<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<!-- <form action="./formSubmit4" method="post"> -->
	<!-- <form action="./formSubmit2" method="post"> -->
<!-- <form action="./formSubmit3" method="post"> -->
<!-- <form action="./formSubmit5" method="post"> -->
<form action="./formSubmit6" method="post">
		<div class="container">
			<br> <label for="username"><b>Emp Id</b></label> <input
				type="text" placeholder="Enter Username" name="userId"
				required="required"> <br> <br> <label
				for="password"><b>Password</b></label> <input type="password"
				id="password" onkeyup="validateForm()" placeholder="Enter Password"
				name="password" required="required"> <i class="fa fa-eye"
				style="position: absolute; right: 25px; top: 234px;"
				onclick="showPassword()" aria-hidden="true"></i> <br> <br>
			<button type="submit" name="login">Login</button>
			<br> <br> <a href="empRegister.jsp">Create Account</a> <a
				href="forgetPassword.html" style="float: right;">Forget Password</a>
		</div>

	</form>
</body>
</html>