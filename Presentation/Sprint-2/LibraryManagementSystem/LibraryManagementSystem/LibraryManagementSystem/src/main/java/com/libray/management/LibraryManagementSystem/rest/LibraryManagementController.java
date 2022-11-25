package com.libray.management.LibraryManagementSystem.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libray.management.LibraryManagementSystem.model.Book;
import com.libray.management.LibraryManagementSystem.service.LibraryManagementService;

@RestController
@RequestMapping("/library-mgmt")
public class LibraryManagementController {
	
		@Autowired
		LibraryManagementService service;
		
		//create a book-post method //add book
		@PostMapping("/addBook")
		public String addBook(@RequestBody Book book ) {
			service.saveBook(book);
			
			return "Book Created Successfully";
			
		}
		
		//bet book by id /read{id}->get
		@GetMapping("/read/{id}")
		public Optional<com.libray.management.LibraryManagementSystem.entity.model.Book> getBookById(@PathVariable Integer id) {
			
			
			return service.getBookById(id);
			
		}
		
		//get all books /allbooks->get(
		@GetMapping("/allBooks")
		public List<com.libray.management.LibraryManagementSystem.entity.model.Book> getAllBooks() {
			return service.getAllBooks();
		}
		
		
		//edit a book /update/{id}->put
		@PutMapping("/update/{id}")
		public String editBook(@RequestBody com.libray.management.LibraryManagementSystem.entity.model.Book book,@PathVariable Integer id) {
			return service.updateBook(id,book);
			
		}
		//delete a bookby id remove/{id}->delete
		@DeleteMapping("remove/{id}")
		public String deleteBookById(@PathVariable Integer id) {
			service.deleteById(id);
			return "deleted successfully";
			
		}
		

	}



