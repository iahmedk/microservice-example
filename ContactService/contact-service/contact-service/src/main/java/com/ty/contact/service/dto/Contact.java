package com.ty.contact.service.dto;

public class Contact {
	private int id;
	private String name;
	private String email;
	private long mobile;
	private long userId;

	public Contact(int id, String name, String email, long mobile, long userId) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.userId = userId;
		this.mobile = mobile;
	}

	public Contact() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
