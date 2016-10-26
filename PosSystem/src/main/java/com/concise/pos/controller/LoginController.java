package com.concise.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.concise.pos.domain.User;
import com.concise.pos.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("loginUser") User user) {
 		return "login";
	}
 
	@RequestMapping(value="/login/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("loginUser") User user, BindingResult result, 
			RedirectAttributes redirectAttr) {
		if(result.hasErrors()) {
			return "addMember";
		}

			 //  Error caught by ControllerAdvice IF no authorization...
		userService.save(user);
		redirectAttr.addFlashAttribute("success", "Successfully added new user!");
	   	return "redirect:/login";
	}
	
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(@ModelAttribute("loginUser") User user, Model model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {
 		return "redirect:/login";
 	}
}
