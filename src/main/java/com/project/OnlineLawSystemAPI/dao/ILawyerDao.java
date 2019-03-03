package com.project.OnlineLawSystemAPI.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineLawSystemAPI.model.Lawyer;

@Repository
public interface ILawyerDao extends CrudRepository<Lawyer, String>{

}
