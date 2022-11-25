package com.digitalbooks.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubscribedBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 Integer subsctiptionId;
	 String bookTitle;
	 String bookAuthor;
	 String readerName;
	 LocalDateTime subscribedTime;

}
