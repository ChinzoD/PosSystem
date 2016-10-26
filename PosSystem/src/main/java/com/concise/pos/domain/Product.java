package com.concise.pos.domain;
// Generated Oct 25, 2016 4:03:07 PM by Hibernate Tools 5.1.0.CR1

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product", catalog = "concise_pos")
public class Product implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;
	private Category category;
	
	@Size(min=4, max=50, message="{Size.Product.name.validation}")
	private String name;
	
	@Min(value=0, message="{Min.Product.Price.validation}")
	@Digits(integer=8, fraction=2, message="{Digits.Product.Price.validation}")
	private double price;
	
	private int quantity;
	private String description;
	@JsonIgnore 
	@Transient
	private MultipartFile  productImage;
	
	private List<SellLine> sellLines;

	public Product() {
	}

	public Product(Category category,  String name, double price, int quantity) {
		this.category = category;
	
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(Category category, Store store, String name, double price, int quantity, List<SellLine> sellLines) {
		this.category = category;
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.sellLines = sellLines;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "productId", unique = true, nullable = false)
	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId", nullable = false)
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	@XmlTransient
	@Transient
	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	

	@Column(name = "name", nullable = false, length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public List<SellLine> getSellLines() {
		return this.sellLines;
	}

	public void setSellLines(List<SellLine> sellLines) {
		this.sellLines = sellLines;
	}

}
