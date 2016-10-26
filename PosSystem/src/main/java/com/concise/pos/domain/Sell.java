package com.concise.pos.domain;
// Generated Oct 25, 2016 3:25:52 PM by Hibernate Tools 5.1.0.CR1

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sell generated by hbm2java
 */
@Entity
@Table(name = "sell", catalog = "concise_pos")
public class Sell implements java.io.Serializable {

	private Integer sellId;
	private User user;
	private Date date;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "sellId", unique = true, nullable = false)
	public Integer getSellId() {
		return this.sellId;
	}

	public void setSellId(Integer sellId) {
		this.sellId = sellId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sell")
	public List<SellLine> getSellLines() {
		return this.sellLines;
	}

	public void setSellLines(List<SellLine> sellLines) {
		this.sellLines = sellLines;
	}

}
