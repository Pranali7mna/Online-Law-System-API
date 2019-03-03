package com.project.OnlineLawSystemAPI.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OnlineLawSystemAPI.dao.IUserDao;
import com.project.OnlineLawSystemAPI.model.User;
import com.project.OnlineLawSystemAPI.service.IUserService;


@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserDao userDao;
	
	@Override
	public User doLogin(String username, String password) {
		User user=userDao.findUserByUsername(username);
		if(user!=null) {
			user=userDao.checkCredentials(username, password);
			if(user!=null) {
				return user;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}

	@Override
	public List<User> fetchAllUsers() {
		return (List<User>) userDao.findAll();
	}

	@Override
	public User saveUser(User user) {
		if(userDao.findUserByUsername(user.getUsername())==null) {
			return userDao.save(user);
		}else {
			throw new RuntimeException("Username already exist");
		}
	}

	
}
