package com.user.controller;

import java.io.IOException;

import com.user.dao.UserDAO;
import com.user.dao.UserDAOImpl;
import com.user.dto.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Edit")
public class EditServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int uid=Integer.parseInt(req.getParameter("id"));
		UserDAO udao=new UserDAOImpl();
		User user=udao.FindUserById(uid);
		
		
		
	}

}
