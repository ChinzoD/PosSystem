package com.concise.pos.controller;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import com.concise.pos.domain.Product;
import com.concise.pos.service.CategoryService;
import com.concise.pos.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;

	@RequestMapping
	public String list(Model model, HttpServletRequest request) {
		model.addAttribute("products", productService.getAllProducts());
		HttpSession session = request.getSession(true); 
		session.setAttribute("categories", categoryService.getAllCategories());
		return "products";
	}

	@RequestMapping("/all")
	public ModelAndView allProducts() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("products", productService.getAllProducts());
		modelAndView.setViewName("products");
		return modelAndView;
	}

	

	@RequestMapping("/product")
	public String getProductById(Model model, @RequestParam("id") String productId) {

		Product product = productService.getProductById(productId);
		model.addAttribute("product", product);
		return "product";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
		return "addProduct";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") @Valid Product productToBeAdded,
			BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "addProduct";
		}

		try {
			productService.addProduct(productToBeAdded);
		} catch (Exception up) {
			System.out.println("Transaction Failed!!!");

		}

		return "redirect:/products";
	}

}