package com.imtiaz.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.imtiaz.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer>{
 
	@Override
     public List<Project>findAll();
}
