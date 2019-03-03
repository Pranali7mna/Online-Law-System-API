package com.project.OnlineLawSystemAPI.service.impl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineLawSystemAPI.dao.ILawyerDao;
import com.project.OnlineLawSystemAPI.model.Court;
import com.project.OnlineLawSystemAPI.model.Lawyer;
import com.project.OnlineLawSystemAPI.service.ICourtService;
import com.project.OnlineLawSystemAPI.service.ILawyerService;

@Service
public class LawyerServiceImpl implements ILawyerService{

	@Autowired
	ILawyerDao lawyerDao; 

	@Autowired
	ICourtService courtService; 
	
	@Override
	public Lawyer saveLawyer(@Valid Lawyer lawyer) {
		Optional<Court> court=courtService.fetchCourtById(lawyer.getCourtId());
		if(court.isPresent()) {
			return lawyerDao.save(lawyer);
		} else {
			throw new RuntimeException("Court not exist, please add court first");
		}
	}

	@Override
	public List<Lawyer> fetchAllLawyers() {
		return (List<Lawyer>) lawyerDao.findAll();
	}

	@Override
	public List<Lawyer> searchLawyer(String term) {
		return lawyerDao.seachLawyer(term.toUpperCase());
	}

}
