package com.imtiaz.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imtiaz.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Long> {

}
