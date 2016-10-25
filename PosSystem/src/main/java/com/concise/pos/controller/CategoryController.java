package com.concise.pos.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.concise.pos.domain.Product;
import com.concise.pos.service.CategoryService;

@Controller
@RequestMapping(value = "/catagory")
public class CategoryController {
	@Autowired
	CategoryService catSer;
	
	
	@RequestMapping("/all")
	public ModelAndView allProducts() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("products", catSer.getAllCategories());
		modelAndView.setViewName("products");
		return modelAndView;
	}
	
	
	}

