package com.project.OnlineLawSystemAPI.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineLawSystemAPI.dao.ILawyerDao;
import com.project.OnlineLawSystemAPI.model.Lawyer;
import com.project.OnlineLawSystemAPI.service.ILawyerService;

@Service
public class LawyerServiceImpl implements ILawyerService{

	@Autowired
	ILawyerDao lawyerDao; 
	
	@Override
	public Lawyer saveLawyer(@Valid Lawyer lawyer) {
		return lawyerDao.save(lawyer);
	}

	@Override
	public List<Lawyer> fetchAllLawyers() {
		return (List<Lawyer>) lawyerDao.findAll();
	}

}
