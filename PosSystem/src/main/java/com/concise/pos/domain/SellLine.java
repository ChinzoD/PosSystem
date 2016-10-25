package com.concise.pos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sell_line")
public class SellLine implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sellLineId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;
	
	@OneToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "sellId")
	private Sell sell;

	public SellLine() {
	}

	public SellLine(Product product, Sell sell, String name, double price) {
		this.product = product;
		this.sell = sell;
		this.name = name;
		this.price = price;
	}

	public Integer getSellLineId() {
		return this.sellLineId;
	}

	public void setSellLineId(Integer sellLineId) {
		this.sellLineId = sellLineId;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Sell getSell() {
		return this.sell;
	}

	public void setSell(Sell sell) {
		this.sell = sell;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
