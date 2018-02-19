package com.et.homeautomation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.et.homeautomation.model.User;
import com.et.homeautomation.service.UserService;

@RestController
@RequestMapping("mobile")
public class UserRestController {
	
@Autowired
private UserService userservice;

@RequestMapping( value="/save", method = RequestMethod.POST)
public void  saveUser(@RequestBody User user) {
	userservice.save(user);
}

@RequestMapping(value="/update", method = RequestMethod.POST)
public void updateUser() {
	
}

@RequestMapping(value="/delete", method = RequestMethod.POST)
public void deleteUser() {
	
}
@RequestMapping(value="/display", method = RequestMethod.GET)
public void displayUsers() {
	
}

}
