package com.digitalbooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.entity.Author;
import com.digitalbooks.repository.IAuthorRepo;

@Service
public class AuthorServiceImpl implements IAuthorService {

	@Autowired
	IAuthorRepo authorRepo;
	
	@Override
	public Long addAuthor(Author author) {
		// TODO Auto-generated method stub
		Author createdAuthor = authorRepo.save(author);
		return createdAuthor.getAuthorId();
	}

//	@Override
//	public Long AuthorLogin(Author author) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Author getAuthorByEmailId(String emailid) {
		// TODO Auto-generated method stub
		Author author = authorRepo.findByAuthormailId(emailid);
		return author;
	}

	
}
