package com.concise.pos.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.concise.pos.domain.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(String productID);
	void addProduct(Product product);

}
