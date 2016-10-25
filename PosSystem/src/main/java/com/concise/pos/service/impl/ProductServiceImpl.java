package com.concise.pos.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.concise.pos.domain.Product;
import com.concise.pos.repository.ProductRepository;
import com.concise.pos.service.ProductService;
@Service
@Transactional

public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productrep;
	@Override
	public List<Product> getAllProducts() {
		List<Product> pr = (List<Product>)productrep.findAll();
		return pr;
	}

	@Override
	public Product getProductById(String productID) {
		Product productById= (Product)productrep.getProductByProductId(productID);
		return productById;
	}

	

	@Override
	public void addProduct(Product product) {
		productrep.save(product);
		
	}	

	
	
}
