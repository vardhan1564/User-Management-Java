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
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet{

	UserDAO udao=null;
	public LoginServlet() {
		System.out.println("Login Request is Made");
		udao=new UserDAOImpl();
		System.out.println("All objects are instatiated");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("It will enter particular doPost or doGet method");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String email=req.getParameter("email");
		String password=req.getParameter("pass");
		
		User user=udao.login(email, password);//
		HttpSession session=req.getSession();
		if(user!=null)
		{
			System.out.println("If user object is not null it will set in Session Object");
			session.setAttribute("user", user);
			req.getRequestDispatcher("Dashboard.jsp").forward(req, resp);
		}
		else
		{
			out.print("Invalid User Credentials");
			req.getRequestDispatcher("Login.jsp").include(req, resp);
		}
		
	}

}
