package com.imtiaz.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imtiaz.model.Pratiksha;
import com.imtiaz.model.Product;

@RestController
public class MainController {

	@RequestMapping("/pratu")
	public String index() {
		return "<h1>Hi pratiksha</h1>";
	}

	@RequestMapping("/userEntry")
	public String userEntry() {
		return " <form action=\"/Imtiaz/suyog\" method=\"POST\">\r\n"
				+ "  <label for=\"fname\">First name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"John\"><br>\r\n"
				+ "  <label for=\"lname\">Last name:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"Doe\"><br><br>\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n" + "</form>  ";
	}

	@RequestMapping(value = "/suyog", method = RequestMethod.POST)
	public String userEntered(@RequestParam String fname, @RequestParam String lname) {
		return "Pagal progich nav:" + fname + " " + lname;
	}

	@RequestMapping("/{id}/tujitang")
	public String useragent(@PathVariable int id, @RequestParam Date date) {
		return "date of" + date + "number is " + id;
	}
	
	@RequestMapping("/{userid}/partu")
	public List<Pratiksha> pratikshadetails()
	{
		return Arrays.asList(new Pratiksha(1,"Shubham Pandit",1.1),new Pratiksha(2,"Suyog Mate",2.2),new Pratiksha(3,"Aanvi Chavan",3.3));
	}
	@RequestMapping("/{id}/productdetails")
	public List<Product> productdetails(){
		return Arrays.asList(new Product(1,"bear", 130), new Product(2,"whisky", 200), new Product(3,"cocktail", 250));
	}
	
}
