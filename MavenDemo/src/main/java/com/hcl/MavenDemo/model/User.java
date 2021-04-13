package com.hcl.MavenDemo.model;

public class User {

	private String uid;
	private String username;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + "]";
	}
	
}
