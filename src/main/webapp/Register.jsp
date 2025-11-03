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
<h1>Register Page</h1>
<form action="Register" method="post">
Enter Username:<input type="text" name="uname"><br>
Enter Email:<input type="text" name="email"><br>
Enter Phone:<input type="number" name="phone"><br>
Enter Password:<input type="password" name="pass"><br>
<input type="submit" value="Register">
</form>
</body>
</html>