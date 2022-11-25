package com.digitalbooks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long authorId;
	private String authorName;
	@Column(unique=true)
	private String authormailId;
	private String authorPassword;
	
	public Author() {
		super();
	}

	public Author(String authorName, String authormailId, String authorPassword) {
		super();
		this.authorName = authorName;
		this.authormailId = authormailId;
		this.authorPassword = authorPassword;
	}

	public Author(Long authorId, String authorName, String authormailId, String authorPassword) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authormailId = authormailId;
		this.authorPassword = authorPassword;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthormailId() {
		return authormailId;
	}

	public void setAuthormailId(String authormailId) {
		this.authormailId = authormailId;
	}

	public String getAuthorPassword() {
		return authorPassword;
	}

	public void setAuthorPassword(String authorPassword) {
		this.authorPassword = authorPassword;
	}
	
	
	
}
