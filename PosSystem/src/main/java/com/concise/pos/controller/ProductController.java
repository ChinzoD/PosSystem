package com.concise.pos.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContext;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.concise.pos.domain.Category;
import com.concise.pos.domain.Product;
import com.concise.pos.exception.ProductNotFoundException;
import com.concise.pos.service.CategoryService;
import com.concise.pos.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ServletContext servletContext;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
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
	public String getProductById(Model model, @RequestParam("id") Integer productId) throws ProductNotFoundException {

		Product product = productService.getProductById(productId);
		model.addAttribute("product", product);
		return "product";
	}
	
	@RequestMapping("/{productId}")
	public @ResponseBody Product getProductById(@PathVariable("productId") Integer productId) throws ProductNotFoundException {

		Product product = productService.getProductById(productId);
		
		return product;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newProduct") Product newProduct, Model model) {
		List<Category> categories = categoryService.getAllCategories();
		model.addAttribute("categories", categories);
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
	

	@RequestMapping(value = "/editProduct", method = RequestMethod.POST)
	public String editProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result,
			HttpServletRequest request) {

		if (result.hasErrors()) {
			return "editProduct";
		}

		MultipartFile productImage = product.getProductImage();
		if (productImage != null && !productImage.isEmpty()) {
			try {
				String rootDirectory = servletContext.getRealPath("/");
				productImage.transferTo(new File(rootDirectory + "\\resources\\images\\" + product.getProductId() + ".png"));
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException("Product image saving failed", ex);
			}
		}

		productService.editProduct(product);

		return "redirect:/products";
	}

	@RequestMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id, Model model, HttpServletRequest request) throws ProductNotFoundException {
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		Path path = Paths.get(rootDirectory + "\\resources\\images\\"+ id + ".png");

		if (Files.exists(path)) {
			try {
				Files.delete(path);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		Product product = productService.getProductById(id);
		productService.deleteProduct(product);

		return "redirect:/products";
	}


}