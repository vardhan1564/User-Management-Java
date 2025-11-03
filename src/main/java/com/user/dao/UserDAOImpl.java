package com.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.user.dbutil.DBConnection;
import com.user.dto.User;

public class UserDAOImpl implements UserDAO {


	Connection con=null;
	@Override
	public boolean registerUser(User user)  {
		boolean flag=false;
	    String register = "INSERT INTO user(username, email, phone, password) VALUES(?,?,?,?)";
		con=DBConnection.getConnection();
		try{
			PreparedStatement pstmt=con.prepareStatement(register);
			pstmt.setString(1, user.getUname());
			pstmt.setString(2, user.getEmail());
			pstmt.setLong(3, user.getPhone());
			pstmt.setString(4, user.getPassword());
			
			int count=pstmt.executeUpdate();//1
			if(count>0)
			{
				flag=true;
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;

	}
	@Override
	public User login(String email, String pass) {
		String login="SELECT * FROM user WHERE email=? AND password=?";
		User user=null;//Object is null here
		try {
			con=DBConnection.getConnection();
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(login);
			pstmt.setString(1, email);
			pstmt.setString(2, pass);
			System.out.println("It takes email and password to execute");
			ResultSet rs=pstmt.executeQuery();
			//rs.next() returns true if data is present
			//else returns false
			System.out.println("Statement executes");
			if(rs.next())
			{
				System.out.println("If Record is present user object get created and data will be set");
				user=new User();
				user.setUname(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getLong("phone"));
				System.out.println("User Details");
				System.out.println(user);
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public List<User> viewAllUsers() {
		String allusers="SELECT * FROM user";
		con=DBConnection.getConnection();
		List<User> userlist=new ArrayList<>();				
		try {
			PreparedStatement pstmt=con.prepareStatement(allusers);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())//1st record,2nd record,3rd record
			{
				User user=new User(); //it will create new user object 
				user.setUid(rs.getInt("uid"));
				user.setUname(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getLong("phone"));
				userlist.add(user);//adds new object each and everytime
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userlist;
	}
	@Override
	public User FindUserById(int id) {
		String login="SELECT * FROM user WHERE uid=?";
		User user=null;//Object is null here
		try {
			con=DBConnection.getConnection();
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(login);
			pstmt.setInt(1, id);
			System.out.println("It takes ID to execute");
			ResultSet rs=pstmt.executeQuery();
			//rs.next() returns true if data is present
			//else returns false
			System.out.println("Statement executes");
			if(rs.next())
			{
				System.out.println("If Record is present user object get created and data will be set");
				user=new User();
				user.setUid(rs.getInt("uid"));
				user.setUname(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getLong("phone"));
				user.setPassword(rs.getString("password"r));
				System.out.println("User Details");
				System.out.println(user);
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
	}
}
