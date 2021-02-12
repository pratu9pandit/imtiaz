package com.imtiaz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.imtiaz.dao.ProjectRepository;
import com.imtiaz.model.Employee;
import com.imtiaz.model.Project;
import com.imtiaz.model.User;


@Controller
@RequestMapping("/projects")
public class HomeControlller {

	
	@Autowired
	ProjectRepository projectRepo;
	
	@GetMapping
	public String displayproject(Model model) {
		List<Project> projectList = projectRepo.findAll();
		model.addAttribute("projectList",projectList);
		return "projects/list_project";
	}
	@GetMapping("/projects")
	public String displayhomepage(Model model) {
		List<Project> projects= projectRepo.findAll();
	     model.addAttribute("projectList",projects);
	     
	   return "homefolder/home";
	}
    
	 
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("formData", new User());
		return "index";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String userRegi(User user, RedirectAttributes attributes) {
		attributes.addFlashAttribute("user", user);
		return "redirect:/display";
	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String userDisplay(User user) {
		return "result";
	}

	@GetMapping("/new")
	public String displayproject1(Model model) {
		
		Project aProject = new Project();
		model.addAttribute("project", aProject);
		return "projects/newproject";
	}
	
	@PostMapping("/save")
	public String saveProjectDetails(Project project, Model model)
	{
		projectRepo.save(project);
		return "redirect:/projects/new";
	}
	
	@GetMapping("/PratuChiTang/{NumberOfRequest}")
	public String palindrome(@PathVariable("NumberOfRequest")String NumberOfRequest)
	{
		int temp = Integer.parseInt(NumberOfRequest);

		int sum = 0,n=Integer.parseInt(NumberOfRequest);

		for (int i = n; n > 0; i--) {
			int r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		
		if (temp==sum)
		{
			return "This number is palindrome";
		}
		else
		{
			return "This number is not palindrome";
		}
		
	
	}
	
	
}
