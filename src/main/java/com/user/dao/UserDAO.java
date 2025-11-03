package com.user.dao;

import java.util.List;

import com.user.dto.User;

public interface UserDAO {

	public boolean registerUser(User user);
	public User login(String email,String pass);
	public List<User> viewAllUsers();
	
	public User FindUserById(int id);
	    
}
