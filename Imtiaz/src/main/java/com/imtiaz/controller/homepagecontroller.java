package com.imtiaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.imtiaz.dao.EmpRepo;
import com.imtiaz.dao.ProjectRepository;
import com.imtiaz.dto.EmployeeProject;
import com.imtiaz.model.Employee;
import com.imtiaz.model.Project;

@Controller
public class homepagecontroller {
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmpRepo empRepo;
	
	
	
    @GetMapping("/")
	public String displayhomepage(Model model) {
		List<Project> projects= proRepo.findAll();
	     model.addAttribute("projectList",projects);
	     
	     List<EmployeeProject> employeeProjectcnt = empRepo.employeeProjects();
	     model.addAttribute("employeeListProjectcnt",employeeProjectcnt);
	     return "homefolder/home";
	}
    
    
}
