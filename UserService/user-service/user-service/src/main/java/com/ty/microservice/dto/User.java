package com.ty.microservice.dto;

import java.util.ArrayList;
import java.util.List;

public class User {
	private long id;
	private String name;
	private List<Contact> contacts = new ArrayList<>();

	public User() {

	}

	public User(long id, String name, List<Contact> contacts) {
		this.id = id;
		this.name = name;
		this.contacts = contacts;
	}

	public User(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

}
