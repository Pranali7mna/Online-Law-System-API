package com.project.OnlineLawSystemAPI.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.OnlineLawSystemAPI.model.Lawyer;
import com.project.OnlineLawSystemAPI.service.ILawyerService;

@RestController
@RequestMapping("/api/lawyer")
public class LawyerController {

	@Autowired
	ILawyerService lawyerService;
	
	@GetMapping
	public ResponseEntity<List<Lawyer>> fetchAllLawyers(){
		List<Lawyer> lawyer=lawyerService.fetchAllLawyers();
		return new ResponseEntity<List<Lawyer>>(lawyer, HttpStatus.OK);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Lawyer>> searchLawyer(@RequestParam String term){
		List<Lawyer> lawyer=lawyerService.searchLawyer(term);
		return new ResponseEntity<List<Lawyer>>(lawyer, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Lawyer> saveLawyer(@Valid @RequestBody Lawyer lawyer){
		Lawyer newLawyer=lawyerService.saveLawyer(lawyer);
		return new ResponseEntity<Lawyer>(newLawyer, HttpStatus.OK);
	}
}
