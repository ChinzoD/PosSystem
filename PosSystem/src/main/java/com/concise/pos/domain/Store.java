package com.concise.pos.domain;
// Generated Oct 25, 2016 3:25:52 PM by Hibernate Tools 5.1.0.CR1

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Store generated by hbm2java
 */
@Entity
@Table(name = "store", catalog = "concise_pos")
public class Store implements java.io.Serializable {

	private Integer storeId;
	private String name;
	private int phone;
	private List<Product> products;

	public Store() {
	}

	public Store(String name, int phone) {
		this.name = name;
		this.phone = phone;
	}

	public Store(String name, int phone, List<Product> products) {
		this.name = name;
		this.phone = phone;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "storeId", unique = true, nullable = false)
	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Column(name = "name", nullable = false, length = 500)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "phone", nullable = false)
	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "store")
	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
