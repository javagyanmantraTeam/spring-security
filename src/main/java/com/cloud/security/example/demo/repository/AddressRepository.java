package com.cloud.security.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.security.example.demo.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
