package com.libray.management.LibraryManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libray.management.LibraryManagementSystem.entity.model.Book;



@Repository
public interface LibraryManagementRepo extends JpaRepository<Book, Integer>{

}
