package com.libray.management.LibraryManagementSystem.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libray.management.LibraryManagementSystem.entity.model.Book;
import com.libray.management.LibraryManagementSystem.repo.LibraryManagementRepo;


@Service
public class LibraryManagementService {

	@Autowired
	LibraryManagementRepo repo;

	public void saveBook(com.libray.management.LibraryManagementSystem.model.Book book) {
		Book bookEntity = mapBookEntity(book);
		repo.save(bookEntity);
	}

	public Optional<Book> getBookById(Integer id) {
		Optional<Book> res=repo.findById(id);
		return res;
	}
	
	public List<Book> getAllBooks() {
		return repo.findAll();
		
	}
	
	public String updateBook(Integer id,Book book) {
		repo.save(book);
		return "Book update succesfully";
		
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}
	
	private Book mapBookEntity(com.libray.management.LibraryManagementSystem.model.Book book) {
		Book entity=new Book();
		entity.setAuthor(book.getAuthor());
		entity.setBorrowed_status(book.isBorrowed_status());
		entity.setGenre(book.getGenre());
		entity.setPrice(book.getPrice());
		entity.setName(book.getName());
		entity.setId(book.getId());
		return entity;
	}


}
