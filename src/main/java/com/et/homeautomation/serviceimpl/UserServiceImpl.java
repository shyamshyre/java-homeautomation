package com.et.homeautomation.serviceimpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.et.homeautomation.dao.UserDao;
import com.et.homeautomation.model.Role;
import com.et.homeautomation.model.User;
import com.et.homeautomation.repository.RoleRepository;
import com.et.homeautomation.service.UserService;

@Service
public class UserServiceImpl implements UserService {

 @Autowired
 private RoleRepository roleRepository;
@Autowired
 private PasswordEncoder passwordEncoder;
@Autowired
private UserDao userdao;

 public void save(User user) {
 user.setPassword(passwordEncoder.encode(user.getPassword()));
 
Role userrole;
Set<Role> rolesrepo = new HashSet<Role>();
 for (Role role : user.getRoles()) {
	 userrole = roleRepository.getOne(role.getId());
	 rolesrepo.add(userrole);
	}
 user.setRoles(rolesrepo);
 userdao.save(user);
 }

 public User findByUsername(String username) {
 return userdao.findByUsername(username);
 }
}