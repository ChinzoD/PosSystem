package com.concise.pos.domain;
// Generated Oct 25, 2016 3:25:52 PM by Hibernate Tools 5.1.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PersistentLogins generated by hbm2java
 */
@Entity
@Table(name = "persistent_logins", catalog = "concise_pos")
public class PersistentLogins implements java.io.Serializable {

	private String series;
	private Date lastUsed;
	private String token;
	private String username;

	public PersistentLogins() {
	}

	public PersistentLogins(String series) {
		this.series = series;
	}

	public PersistentLogins(String series, Date lastUsed, String token, String username) {
		this.series = series;
		this.lastUsed = lastUsed;
		this.token = token;
		this.username = username;
	}

	@Id

	@Column(name = "series", unique = true, nullable = false)
	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_used", length = 19)
	public Date getLastUsed() {
		return this.lastUsed;
	}

	public void setLastUsed(Date lastUsed) {
		this.lastUsed = lastUsed;
	}

	@Column(name = "token")
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name = "username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}