<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Navbar.jsp" %>
<h1>Login Form</h1>
<form action="Login" method="post">

Enter Email:<input type="text" name="email"><br>
Enter Password:<input type="password" name="pass"><br>
<input type="submit" value="Login">

</form>
</body>
</html>