package com.project.OnlineLawSystemAPI.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineLawSystemAPI.model.Court;

@Repository
public interface ICourtDao extends CrudRepository<Court, String>{

	@Query("select court from Court court where upper(court.name) like %?1%")
	List<Court> searchCourt(String term);

}
