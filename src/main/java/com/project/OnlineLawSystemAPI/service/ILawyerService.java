package com.project.OnlineLawSystemAPI.service;

import java.util.List;

import javax.validation.Valid;

import com.project.OnlineLawSystemAPI.model.Lawyer;

public interface ILawyerService {

	Lawyer saveLawyer(@Valid Lawyer lawyer);

	List<Lawyer> fetchAllLawyers();

	List<Lawyer> searchLawyer(String term);

}
