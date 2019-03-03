package com.project.OnlineLawSystemAPI.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.project.OnlineLawSystemAPI.model.Court;

public interface ICourtService {

	List<Court> fetchAllCourts();

	Optional<Court> fetchCourtById(String id);

	Court saveCourt(@Valid Court court);

	List<Court> searchCourt(String term);

}
