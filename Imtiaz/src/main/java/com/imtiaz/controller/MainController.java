package com.imtiaz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping ("/pratu")
	public String index()
	{
		return "<h1>Hi pratiksha</h1>";
	}
	
	
	@RequestMapping("/userEntry")
	public String userEntry()
	{
		return " <form action=\"/Imtiaz/suyog\" method=\"POST\">\r\n"
				+ "  <label for=\"fname\">First name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"John\"><br>\r\n"
				+ "  <label for=\"lname\">Last name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"Doe\"><br><br>\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n"
				+ "</form>  ";
	}
	
	@RequestMapping(value="/suyog", method = RequestMethod.POST)
	public String userEntered(@RequestParam String fname, @RequestParam String lname)
	{
		return "Pagal progich nav:"+ fname +" "+lname;
	}

}
