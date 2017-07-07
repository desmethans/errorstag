package org.example;

import org.hibernate.validator.constraints.NotBlank;

public class Person {
	@NotBlank
	private String firstname;
	@NotBlank
	private String lastname;
	@NotBlank
	private String title;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
