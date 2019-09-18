package com.silicus.librabrymanagment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.silicus.librabrymanagment.daoimpl.BookDaoIImpl;
import com.silicus.librabrymanagment.entity.Book;
import com.silicus.librabrymanagment.service.BookService;

public class BookServiceImpl implements BookService {
//save
	@Autowired
	private BookDaoIImpl bookDaoIImpl;
	
	public void save(Book book) {
		 bookDaoIImpl.save(book);
	}

	public Book get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(long id, Book book) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
