package com.user.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.user.dao.UserDAO;
import com.user.dao.UserDAOImpl;
import com.user.dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet{

	UserDAO udao=null;
	@Override
	public void init() throws ServletException {
		
		udao=new UserDAOImpl();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String username=req.getParameter("username");
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		String password=req.getParameter("pass");
		User user=new User(username, email, phone, password);
		
		boolean isRegistered=udao.registerUser(user);
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		if(isRegistered)
		{
			out.println("Registered Successfully");
			req.getRequestDispatcher("Login.jsp").include(req, resp);
		}
		
	}
}
