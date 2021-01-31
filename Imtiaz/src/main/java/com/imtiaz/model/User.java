package com.imtiaz.model;

public class User {
	
	
	private String fullname;
	private String lastname;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String fullname, String lastname) {
		super();
		this.fullname = fullname;
		this.lastname = lastname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
