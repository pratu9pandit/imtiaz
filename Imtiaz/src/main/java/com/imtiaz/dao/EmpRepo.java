package com.imtiaz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.imtiaz.dto.EmployeeProject;
import com.imtiaz.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {
	@Query(nativeQuery = true, value = "select e.EMP_FIRST_NAME, e.EMP_LAST_NAME, count(e.employee_id) from employee e left join project  p on p.name= e.emp_first_name group BY e.emp_first_name, e.emp_last_name")
	public List<EmployeeProject> employeeProjects();

}