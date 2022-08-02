package com.ty.contact.service.service;

import java.util.List;

import com.ty.contact.service.dto.Contact;

public interface ContactService {
	List<Contact> getContacts(long userId);
}
