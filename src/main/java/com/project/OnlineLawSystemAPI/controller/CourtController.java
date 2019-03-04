package com.project.OnlineLawSystemAPI.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.OnlineLawSystemAPI.model.Court;
import com.project.OnlineLawSystemAPI.service.ICourtService;

@RestController
@CrossOrigin
@RequestMapping("/api/court")
public class CourtController {

	@Autowired
	ICourtService courtService;
	
	@GetMapping
	public ResponseEntity<List<Court>> fetchAllCourts(){
		List<Court> court=courtService.fetchAllCourts();
		return new ResponseEntity<List<Court>>(court, HttpStatus.OK);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Court>> searchCourt(@RequestParam String term){
		List<Court> court=courtService.searchCourt(term);
		return new ResponseEntity<List<Court>>(court, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Court> saveCourt(@Valid @RequestBody Court court){
		Court newCourt=courtService.saveCourt(court);
		return new ResponseEntity<Court>(newCourt, HttpStatus.OK);
	}
}
