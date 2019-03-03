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

import com.project.OnlineLawSystemAPI.model.LawDetail;
import com.project.OnlineLawSystemAPI.service.ILawDetailService;

@RestController
@RequestMapping("/api/law")
public class LawDetailController {

	@Autowired
	ILawDetailService lawService;
	
	@GetMapping
	public ResponseEntity<List<LawDetail>> fetchAllLaws(){
		List<LawDetail> lawDetail=lawService.fetchAllLaws();
		return new ResponseEntity<List<LawDetail>>(lawDetail, HttpStatus.OK);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<LawDetail>> searchLaw(@RequestParam String term){
		List<LawDetail> lawDetail=lawService.searchLaw(term);
		return new ResponseEntity<List<LawDetail>>(lawDetail, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<LawDetail> saveLaw(@Valid @RequestBody LawDetail law){
		LawDetail newLaw=lawService.saveLaw(law);
		return new ResponseEntity<LawDetail>(newLaw, HttpStatus.OK);
	}
}
