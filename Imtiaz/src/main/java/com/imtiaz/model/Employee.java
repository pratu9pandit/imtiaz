package com.imtiaz.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long employeeId;
	private String empFirstName;
	private String empLastName;
	private String empEmail;
	@ManyToOne
	@JoinColumn(name = "projectId")
	private Project myProject;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empFirstName, String empLastName, String empEmail) {
		super();
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmail = empEmail;
	}
	
	public Project getMyProject() {
		return myProject;
	}
	public void setMyProject(Project myProject) {
		this.myProject = myProject;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmail=" + empEmail + "]";
	}
	public void setProjects(List<Project> asList) {
		// TODO Auto-generated method stub
		
	}
	
	

}
