package com.project.OnlineLawSystemAPI.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineLawSystemAPI.model.Court;

@Repository
public interface ICourtDao extends CrudRepository<Court, String>{

}
