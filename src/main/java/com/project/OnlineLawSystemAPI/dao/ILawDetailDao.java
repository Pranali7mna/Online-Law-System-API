package com.project.OnlineLawSystemAPI.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineLawSystemAPI.model.LawDetail;

@Repository
public interface ILawDetailDao extends CrudRepository<LawDetail, String>{

	@Query("select law from LawDetail law where upper(law.section) like %?1% or upper(law.rule) like %?1%")
	List<LawDetail> seachLaw(String term);

}
