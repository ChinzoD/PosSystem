package com.concise.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.concise.pos.service.CategoryService;

@Controller
@RequestMapping(value = "/catagory")
public class CategoryController {
	@Autowired
	CategoryService catSer;
}
