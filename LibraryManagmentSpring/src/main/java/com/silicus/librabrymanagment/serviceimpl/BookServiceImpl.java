package com.silicus.librabrymanagment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silicus.librabrymanagment.daoimpl.BookDaoIImpl;
import com.silicus.librabrymanagment.entity.Book;
import com.silicus.librabrymanagment.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDaoIImpl bookDaoIImpl;

	public void save(Book book) {
		bookDaoIImpl.save(book);
	}

	public Book get(long id) {

		return bookDaoIImpl.get(id);

	}

	public List<Book> list() {

		return bookDaoIImpl.list();
	}

	public Object update(long id, Book book) {
		return bookDaoIImpl.update(id, book);

	}

	public void delete(long id) {
		bookDaoIImpl.delete(id);

	}

}
