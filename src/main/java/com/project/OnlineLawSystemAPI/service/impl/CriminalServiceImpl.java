package com.project.OnlineLawSystemAPI.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineLawSystemAPI.dao.ICriminalDao;
import com.project.OnlineLawSystemAPI.model.Criminal;
import com.project.OnlineLawSystemAPI.service.ICriminalService;

@Service
public class CriminalServiceImpl implements ICriminalService{

	@Autowired
	ICriminalDao criminalDao;
	
	@Override
	public List<Criminal> fetchAllCriminals() {
		return (List<Criminal>) criminalDao.findAll();
	}

	@Override
	public Criminal saveCriminal(@Valid Criminal criminal) {
		return criminalDao.save(criminal);
	}

}
