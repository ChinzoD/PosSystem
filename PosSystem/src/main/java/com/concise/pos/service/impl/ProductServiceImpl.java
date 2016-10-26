package com.concise.pos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.concise.pos.domain.Product;
import com.concise.pos.exception.ProductNotFoundException;
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
	public Product getProductById(Integer productID) throws ProductNotFoundException {
		Product product = productrep.getProductByProductId(productID);
		if(product==null) {			
			throw new ProductNotFoundException(productID, "");
		}
		return product;
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		List<Product> prCatagory = productrep.getProductsByCategory(category);
		return prCatagory;
	}
	

	@Override
	public void addProduct(Product product) {
		productrep.save(product);
		
	}

	@Override
	public void editProduct(Product product) {
		productrep.save(product);
				
	}

	@Override
	public void deleteProduct(Product product) {
		productrep.delete(product);
		
		
	}
	
}
