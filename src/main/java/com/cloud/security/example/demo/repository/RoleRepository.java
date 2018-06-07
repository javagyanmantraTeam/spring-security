package com.cloud.security.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.security.example.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
