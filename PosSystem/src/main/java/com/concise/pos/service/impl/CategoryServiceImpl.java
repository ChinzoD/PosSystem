package com.concise.pos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.concise.pos.domain.Product;
import com.concise.pos.repository.CategoryRepository;
import com.concise.pos.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryRepository caRepo;
	
	@Override
	public List<Product> getProductsByCategory(String category) {
		List<Product> prCatagory = (List<Product>)caRepo.getProductsByCategory(category);
		return prCatagory;
	}
}
