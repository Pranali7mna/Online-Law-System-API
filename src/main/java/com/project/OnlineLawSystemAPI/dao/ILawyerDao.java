package com.project.OnlineLawSystemAPI.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineLawSystemAPI.model.Lawyer;

@Repository
public interface ILawyerDao extends CrudRepository<Lawyer, String>{

	@Query("select lawyer from Lawyer lawyer where upper(lawyer.expertise) like %?1%")
	List<Lawyer> seachLawyer(String term);

}
