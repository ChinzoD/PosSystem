package com.concise.pos.service;

import java.util.List;

import com.concise.pos.domain.Product;
import com.concise.pos.exception.ProductNotFoundException;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(Integer productId) throws ProductNotFoundException;
	
    List<Product> getProductsByCategory(String category);
	
	void addProduct(Product product);

	void editProduct(Product product);

	void deleteProduct(Product product);

}
