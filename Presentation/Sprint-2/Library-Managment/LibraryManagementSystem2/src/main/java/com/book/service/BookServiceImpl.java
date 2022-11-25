package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.book.entity.Book;
import com.book.exception.ResourceNotFoundException;



@Service
public class BookServiceImpl implements IBookService{
	
	
	@Autowired
	IBookRepo bookrepo;

	@Override
	public Integer saveBook(Book book) {
		// This will add the book in the application
		Book savedBook = bookrepo.save(book);
		return savedBook.getId();
	}
	
	@Override
	public Optional<Book> getBook(Integer id) {
		// This will display the book by id
		
		return bookrepo.findById(id);
	}

	@Override
	public List<Book> getAllBooks() {
		// This will get all the book available in the library
		return bookrepo.findAll();
	}

	@Override
	public Book updateBook(Book book, Integer id) {
		// This will update the details of existing book
		Book existingBook = bookrepo.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Book", "id", id));
		existingBook.setName(book.getName());
		existingBook.setAuthor(book.getAuthor());
		existingBook.setPrice(book.getPrice());
		existingBook.setGenre(book.getGenre());
		existingBook.setBorrowed_status(book.isBorrowed_status());
		
		bookrepo.save(existingBook);
		
		return existingBook;
		
	}

	@Override
	public void removeBook(Integer id) {
		// This will remove the existing book by Id
		bookrepo.deleteById(id);
		
		
	}

	@Override
	public Book updateBorrowStatus(Book book, Integer id) {
		// This will update the borrowed Status of the particular book by Id
		Book existBook = bookrepo.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Book", "id", id));
		existBook.setBorrowed_status(book.isBorrowed_status());
		
		bookrepo.save(existBook);
		
		return existBook;
	}

}
