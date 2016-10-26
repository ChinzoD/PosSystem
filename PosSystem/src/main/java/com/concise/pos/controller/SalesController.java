package com.concise.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class SalesController {


	@RequestMapping(value="/sales", method = RequestMethod.GET)
	public String login(Model model) {
 		return "sales";
	}
}
