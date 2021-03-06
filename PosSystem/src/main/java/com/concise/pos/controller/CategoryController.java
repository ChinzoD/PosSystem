package com.concise.pos.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;



import com.concise.pos.service.CategoryService;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {
	@Autowired
	CategoryService catSer;
	
	
	@RequestMapping("/all")
	public String allProducts(Model model  ) {
		model.addAttribute("categories", catSer.getAllCategories());

		return "category";
	}
	
	
	}

