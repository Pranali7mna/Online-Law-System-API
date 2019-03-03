package com.project.OnlineLawSystemAPI.service;

import java.util.List;

import com.project.OnlineLawSystemAPI.model.User;

public interface IUserService {
	
	public User doLogin(String username, String password);

	public List<User> fetchAllUsers();

	public User saveUser(User user);

}
