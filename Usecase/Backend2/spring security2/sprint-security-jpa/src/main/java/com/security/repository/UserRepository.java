package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

	
	
}
