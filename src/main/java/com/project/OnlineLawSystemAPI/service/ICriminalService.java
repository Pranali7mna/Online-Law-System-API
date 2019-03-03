package com.project.OnlineLawSystemAPI.service;

import java.util.List;

import javax.validation.Valid;

import com.project.OnlineLawSystemAPI.model.Criminal;

public interface ICriminalService {

	List<Criminal> fetchAllCriminals();

	Criminal saveCriminal(@Valid Criminal criminal);

}
