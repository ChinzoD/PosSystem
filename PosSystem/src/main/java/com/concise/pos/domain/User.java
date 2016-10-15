package com.concise.pos.domain;
// Generated Oct 14, 2016 2:40:26 PM by Hibernate Tools 5.1.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer userId;
	private String username;
	private String firstName;
	private String lastName;
	private Set sells = new HashSet(0);

	public User() {
	}

	public User(String username, String firstName, String lastName) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String username, String firstName, String lastName, Set sells) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sells = sells;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set getSells() {
		return this.sells;
	}

	public void setSells(Set sells) {
		this.sells = sells;
	}

}
