<%@page import="com.user.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>User Edit Form </h2>
	<%
		User user=(User) request.getAttribute("updateuser");
	
		
	%>
	
	<form action="Update" method="post">
		<input type="hidden" name="uid" value="">
		Username<input type="text" name="uname" value="">
		EMail<input type="text" name="email" value="">
		Phone<input type="text" name="phone" value="">
		Password<input type="text" name="pass" value="">
	
	</form>
	
	
</body>
</html>