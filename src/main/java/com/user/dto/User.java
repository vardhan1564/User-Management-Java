package com.user.dto;

public class User {
	private int uid;
	private String uname;
	private String email;
	private long phone;
	private String password;
	
	
	public User() {
		
	}
	
	public User(String uname, String email, long phone, String password) {
		super();
		this.uname = uname;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	
}
