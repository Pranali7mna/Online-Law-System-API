package com.project.OnlineLawSystemAPI.dao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.OnlineLawSystemAPI.model.User;


@Repository
public interface IUserDao extends CrudRepository<User, String>{

	@Query("select user from User user where user.username=?1 and user.password=?2")
	 User checkCredentials(String username,String password);

	@Query("select user from User user where user.username=?1")
	User findUserByUsername(String username);
}
