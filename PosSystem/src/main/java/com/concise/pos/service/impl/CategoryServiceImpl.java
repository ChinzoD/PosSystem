package com.concise.pos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.concise.pos.domain.Category;
import com.concise.pos.repository.CategoryRepository;
import com.concise.pos.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
@Autowired
CategoryRepository catrepo;
	

	@Override
	public List<Category> getAllCategories() {
		List<Category>categories=(List<Category>)catrepo.findAll();
		return categories;
	}
}
