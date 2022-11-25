package com.digitalbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalbooks.entity.Author;

public interface IAuthorRepo extends JpaRepository<Author, Long>{
	Author findByAuthormailId(String authormailId);
	

}
