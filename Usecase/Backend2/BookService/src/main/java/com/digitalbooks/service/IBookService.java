package com.digitalbooks.service;

import java.util.List;

import com.digitalbooks.entity.Book;

public interface IBookService {
	
	public Book saveBook(Book book);
	public List<Book> getAllBooks();
	public void deleteById(Long id);
	
//	public Book blockBook(Long bookId, String block);
//	public Book updateBook(Book book);
//	public Book getBookById(Long id);
//	public List<Book> getBooksByAuthorId(Long authorId);
//	public List<Book> getAllBooks();
	
	public List<Book> searchBooks(String query);

}
