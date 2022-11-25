package com.book.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String author;
	private float price;
	private String genre;
	private boolean borrowed_status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isBorrowed_status() {
		return borrowed_status;
	}
	public void setBorrowed_status(boolean borrowed_status) {
		this.borrowed_status = borrowed_status;
	}
	public Book(int id, String name, String author, float price, String genre, boolean borrowed_status) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.genre = genre;
		this.borrowed_status = borrowed_status;
	}
	public Book() {
		super();
	}
	
	
	
	
}
