package com.et.homeautomation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.et.homeautomation.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}