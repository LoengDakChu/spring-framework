package org.springframework.context.support;

public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
	}

	public User(String name) {
		this.name = name;
	}
}
