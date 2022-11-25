package com.digitalbooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.entity.Book;
import com.digitalbooks.repository.IBookRepo;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	IBookRepo bookRepo;

	@Override
	public Book saveBook(Book book) {
		// This will save the book
		Book savedBook = bookRepo.save(book);
		return savedBook;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		
		return bookRepo.findAll();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(id);
		
	}
	
	
	
	//bookservice constructor not injected

	@Override
	public List<Book> searchBooks(String query) {
		// TODO Auto-generated method stub
		List<Book> books =bookRepo.searchBooks(query);
		return books;
		
		
	}

}
