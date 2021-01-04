package com.spring.model;

import java.util.List;

public class Person {

	private Long contact;
	private String name;
	private String email;
	private List<String> languages;
	private Address address;

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
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

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [contact=" + contact + ", name=" + name + ", email=" + email + ", languages=" + languages
				+ ", address=" + address + "]";
	}

}
