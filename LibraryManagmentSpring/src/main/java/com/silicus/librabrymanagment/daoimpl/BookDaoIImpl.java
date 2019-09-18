package com.silicus.librabrymanagment.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.silicus.librabrymanagment.dao.BookDao;
import com.silicus.librabrymanagment.entity.Book;

public class BookDaoIImpl implements BookDao{

	@Autowired
	private SessionFactory factory;
	
	public void save(Book book) {
	
		factory.getCurrentSession().save(book);
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
