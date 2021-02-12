package com.imtiaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imtiaz.dao.EmpRepo;
import com.imtiaz.model.Employee;
import com.imtiaz.model.Project;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmpRepo empRepo;
	
	@GetMapping
	public String displayemployee(Model model) {
		List<Employee> employeeList = empRepo.findAll();
		model.addAttribute("employeeList",employeeList);
		return "employees/list_employee";
	}
	/*@GetMapping("/")
	public String displayhomepage(Model model) {
		
	     List<Employee> employee = empRepo.findAll();
	     model.addAttribute("employeeList",employee);
	     return "homefolder/home";
	}*/
    
	
	
	@GetMapping("/new")
	public String displayproject(Model model) {
	   Employee anEmployee = new Employee();	
       model.addAttribute("emp", anEmployee);
		return "employees/newemployee";
	}
	
	@PostMapping("/emp")
	public String employee(Model model, Employee emp)
	{
		empRepo.save(emp);
		return "redirect:/employees/new";
	}


}
