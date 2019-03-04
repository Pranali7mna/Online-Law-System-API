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
import org.springframework.web.bind.annotation.RestController;

import com.project.OnlineLawSystemAPI.model.Criminal;
import com.project.OnlineLawSystemAPI.service.ICriminalService;

@RestController
@CrossOrigin
@RequestMapping("/api/criminal")
public class CriminalController {
	
	@Autowired
	ICriminalService criminalService;
	
	@GetMapping
	public ResponseEntity<List<Criminal>> fetchAllCriminals(){
		List<Criminal> criminal=criminalService.fetchAllCriminals();
		return new ResponseEntity<List<Criminal>>(criminal, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Criminal> saveCriminal(@Valid @RequestBody Criminal criminal){
		Criminal newCriminal=criminalService.saveCriminal(criminal);
		return new ResponseEntity<Criminal>(newCriminal, HttpStatus.OK);
	}
}