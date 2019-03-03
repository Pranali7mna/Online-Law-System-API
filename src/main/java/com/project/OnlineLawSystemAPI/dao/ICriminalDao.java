package com.project.OnlineLawSystemAPI.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineLawSystemAPI.model.Criminal;

@Repository
public interface ICriminalDao extends CrudRepository<Criminal, String>{

}
