package com.et.homeautomation.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.et.homeautomation.model.Role;
import com.et.homeautomation.model.User;
import com.et.homeautomation.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
 @Autowired
 private UserRepository userRepository;

 @Transactional(readOnly = true)
 public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
 User user = userRepository.findByUsername(username);

 Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
 for (Role role : user.getRoles()){
 grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
 }

 return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
 }
}
