package com.concise.pos.service;

import java.util.List;

import com.concise.pos.domain.Product;

public interface CategoryService {
	
    List<Product> getProductsByCategory(String category);
}
