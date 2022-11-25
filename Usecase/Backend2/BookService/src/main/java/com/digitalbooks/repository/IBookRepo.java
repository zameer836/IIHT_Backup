package com.digitalbooks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.digitalbooks.entity.Book;

@Repository
public interface IBookRepo extends JpaRepository<Book, Long> {
	
//	@Query("SELECT b from Book b WHERE "+
//	"b.title LIKE CONCAT('%', :query, '%')" +
//	"b.author LIKE CONCAT('%', :query, '%')"+
//	"b.publisher LIKE CONCAT('%', :query, '%')"+
//	"b.publishedDate LIKE CONCAT('%', :query, '%')")
//	List<Book> searchBooks(String query);
	
//	@Query(value = "SELECT * from book b WHERE "+
//			"b.title LIKE CONCAT('%', :query, '%')" +
//			"Or b.author LIKE CONCAT('%', :query, '%')"+
//			"Or b.publisher LIKE CONCAT('%', :query, '%')"+
//			"Or b.publishedDate LIKE CONCAT('%', :query, '%')", nativeQuery = true)
//			List<Book> searchBooks(String query);

	@Query(value = "SELECT * from book b WHERE "+
			"b.title LIKE CONCAT('%', :query, '%')" +
			"Or b.author LIKE CONCAT('%', :query, '%')"+
			"Or b.publisher LIKE CONCAT('%', :query, '%')"+
			"Or b.price LIKE CONCAT('%', :query, '%')"+
			"Or b.category LIKE CONCAT('%', :query, '%')", nativeQuery = true)
			List<Book> searchBooks(String query);

	
	
}
