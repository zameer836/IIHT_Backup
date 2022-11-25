package com.libray.management.LibraryManagementSystem.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	private int id;

	@Column
	private String name;

	@Column
	private String author;

	@Column
	private float price;

	@Column
	private String genre;

	@Column
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

}
