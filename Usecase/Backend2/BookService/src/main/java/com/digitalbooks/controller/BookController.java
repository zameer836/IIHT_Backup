package com.digitalbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.entity.Book;
import com.digitalbooks.service.IBookService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")

///digitalbooks-ngcode.s3-website-us-east-1.amazonaws.com

@RequestMapping("api/v1/digitalbooks")
public class BookController {

	@Autowired
	private IBookService bookservice;
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		Book savedBook = bookservice.saveBook(book);
		return savedBook;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello this app is running";
	}
	
	@GetMapping("getAllBooks")
	public List<Book> getBooks() {
		List<Book> savedBookList = bookservice.getAllBooks();
		return savedBookList;
	}
	
	@DeleteMapping("/deleteBookById/{bookId}")
	public ResponseEntity<Book> deleteById(@PathVariable Long bookId) {
		ResponseEntity<Book> responseEntity = new ResponseEntity<> (HttpStatus.OK);
		
		try {
			bookservice.deleteById(bookId);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Book>> serchBooks(@RequestParam("query") String query) {
		return ResponseEntity.ok(bookservice.searchBooks(query));
	}
	
	
	
}
