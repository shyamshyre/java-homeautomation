package com.et.homeautomation.service;

import com.et.homeautomation.model.User;

public interface UserService {
 void save(User user);

 User findByUsername(String username);
}