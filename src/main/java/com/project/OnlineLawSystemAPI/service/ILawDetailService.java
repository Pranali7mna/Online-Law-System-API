package com.project.OnlineLawSystemAPI.service;

import java.util.List;

import javax.validation.Valid;

import com.project.OnlineLawSystemAPI.model.LawDetail;

public interface ILawDetailService {

	List<LawDetail> fetchAllLaws();

	LawDetail saveLaw(@Valid LawDetail law);

	List<LawDetail> searchLaw(String term);

}
