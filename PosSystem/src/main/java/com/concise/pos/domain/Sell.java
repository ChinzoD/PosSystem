package com.concise.pos.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sell implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sellId;
		
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	@OneToMany(mappedBy ="sell")
	private List<SellLine> sellLines;

	public Sell() {
	}

	public Sell(User user, Date date) {
		this.user = user;
		this.date = date;
	}

	public Sell(User user, Date date, List<SellLine> sellLines) {
		this.user = user;
		this.date = date;
		this.sellLines = sellLines;
	}

	public Integer getSellId() {
		return this.sellId;
	}

	public void setSellId(Integer sellId) {
		this.sellId = sellId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<SellLine> getSellLines() {
		return this.sellLines;
	}

	public void setSellLines(List<SellLine> sellLines) {
		this.sellLines = sellLines;
	}

}
