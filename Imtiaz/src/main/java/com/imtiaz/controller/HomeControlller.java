package com.imtiaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.imtiaz.model.User;

@Controller
public class HomeControlller {
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("formData", new User());
		return "index";
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public String userRegi(User user,RedirectAttributes attributes)
	{
		attributes.addFlashAttribute("user", user);
		return "redirect:/display";
	}
	
	
	@RequestMapping(value="/display", method = RequestMethod.GET)
	public String userDisplay(User user)
	{
		return "result";
	}
}
