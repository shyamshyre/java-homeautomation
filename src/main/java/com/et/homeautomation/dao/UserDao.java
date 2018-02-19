package com.et.homeautomation.dao;

import java.util.List;

import com.et.homeautomation.model.User;


public interface UserDao {

	User findById(int id);
	
	User findByUsername(String username);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

