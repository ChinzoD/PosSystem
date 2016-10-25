package com.concise.pos.service;

import java.util.List;

import com.concise.pos.domain.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(String productID);
	
    List<Product> getProductsByCategory(String category);
	
	void addProduct(Product product);

}
