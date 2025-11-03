<%@page import="com.user.dto.User"%>
<%@page import="java.util.List"%>
<%@page import="com.user.dao.UserDAO"%>
<%@page import="com.user.dao.UserDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
	<thead>
		<tr>
			<th>UserName:</th>
			<th>EMail:</th>
			<th>Phone:</th>
		</tr>					
	</thead>
	<tbody>
		<%
			UserDAO udao=new UserDAOImpl();
			List<User> ulist=udao.viewAllUsers();
			for(User user:ulist){
				%>
					<tr>
						<td> <%= user.getUname() %></td>
						<td> <%= user.getEmail() %></td>
						<td> <%= user.getPhone() %></td>
					</tr>
					<%} %>
				</tbody>		
		</body>
	</table>
</body>
</html>