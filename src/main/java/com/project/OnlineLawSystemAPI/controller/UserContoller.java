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

import com.project.OnlineLawSystemAPI.model.User;
import com.project.OnlineLawSystemAPI.service.IUserService;


@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserContoller {

	@Autowired
	IUserService userService;
	
	@GetMapping("/login")
	public ResponseEntity<User> login(@RequestParam(name="username",required=true) String username,@RequestParam(name="password",required=true) String password) {
		User user=userService.doLogin(username, password);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> fetchAllUsers(){
		List<User> user=userService.fetchAllUsers();
		return new ResponseEntity<List<User>>(user, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user){
		User newUser=userService.saveUser(user);
		return new ResponseEntity<User>(newUser, HttpStatus.OK);
	}
	
}

