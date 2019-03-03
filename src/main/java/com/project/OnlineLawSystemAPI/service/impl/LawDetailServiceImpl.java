package com.project.OnlineLawSystemAPI.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineLawSystemAPI.dao.ILawDetailDao;
import com.project.OnlineLawSystemAPI.model.LawDetail;
import com.project.OnlineLawSystemAPI.service.ILawDetailService;

@Service
public class LawDetailServiceImpl implements ILawDetailService{

	@Autowired
	ILawDetailDao lawDao;
	
	@Override
	public List<LawDetail> fetchAllLaws() {
		return (List<LawDetail>) lawDao.findAll();
	}

	@Override
	public LawDetail saveLaw(@Valid LawDetail law) {
		return lawDao.save(law);
	}

	@Override
	public List<LawDetail> searchLaw(String term) {
		return lawDao.seachLaw(term.toUpperCase());
	}

}
