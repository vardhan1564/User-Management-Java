<%@ page import="com.user.dto.User"%>
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
<h1>User Dashboard</h1>
<%
	User u=(User)session.getAttribute("user");
	
	if(u!=null)
	{
%>
	<h2><%= u.getUid() %></h2>
	
	<h2><%=u.getUname() %></h2>

	<h2><%=u.getEmail() %></h2>
	
	<h2><%=u.getPhone() %></h2>
	
	
<%} %>    <!-- closing curly bracket of if condition -->


</body>
</html>