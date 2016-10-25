package com.concise.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.concise.pos.domain.Product;
import com.concise.pos.service.CategoryService;

@Controller
@RequestMapping(value="/catagory")
public class CategoryController {
@Autowired
CategoryService catSer;
	
@RequestMapping(value = "/{name}" , method = RequestMethod.GET)
  String getProductsByCategory(@PathVariable(value = "name") String name, Model model){
	
List <Product> pr= catSer.getProductsByCategory(name);
	model.addAttribute("productList", pr);
	return "/category";
}
}
