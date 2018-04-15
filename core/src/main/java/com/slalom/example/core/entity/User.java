package com.slalom.example.core.entity;

public class User {

	private final String id;
	private final String email;
	private final String password;
	private final Role role;

	public User(final String email, final String password) {
		this.id = null;
		this.email = email;
		this.password = password;
		this.role = Role.USER;
	}

	public User(final String id, final String email, final String password) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = Role.USER;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User{" +
			"id='" + id + '\'' +
			", email='" + email + '\'' +
			", password='" + password + '\'' +
			", role=" + role +
			'}';
	}
}
