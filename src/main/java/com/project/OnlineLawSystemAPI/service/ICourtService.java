package com.project.OnlineLawSystemAPI.service;

import java.util.List;

import javax.validation.Valid;

import com.project.OnlineLawSystemAPI.model.Court;

public interface ICourtService {

	List<Court> fetchAllCourts();

	Court saveCourt(@Valid Court court);

}
