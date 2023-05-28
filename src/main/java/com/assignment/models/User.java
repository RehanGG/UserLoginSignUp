package com.assignment.models;

import javax.servlet.http.HttpServletRequest;

public class User {
	private int id;
	private String username;
	
	private String fullName;
	private String gender;
	
	public User(int id, String username, String fullName, String gender) {
		super();
		this.id = id;
		this.username = username;
		
		this.fullName = fullName;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static User fromRequest(HttpServletRequest request) {
		
		String user = request.getParameter("username");
		String gender = request.getParameter("gender");
		String fullname = request.getParameter("fullname");
		
		return new User(-1, user, fullname, gender);
	}
	
}

