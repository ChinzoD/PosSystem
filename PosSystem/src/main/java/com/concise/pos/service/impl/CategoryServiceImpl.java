package com.concise.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.concise.pos.domain.Product;
import com.concise.pos.repository.CategoryRepository;

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
