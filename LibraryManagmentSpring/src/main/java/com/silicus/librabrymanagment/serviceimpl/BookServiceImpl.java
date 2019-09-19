package com.silicus.librabrymanagment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silicus.librabrymanagment.dao.BookDao;
import com.silicus.librabrymanagment.entity.Book;
import com.silicus.librabrymanagment.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	public void save(Book book) {
		bookDao.save(book);
	}

	public Book get(long id) {

		return bookDao.get(id);

	}

	public List<Book> list() {

		return bookDao.list();
	}

	public Object update(long id, Book book) {
		return bookDao.update(id, book);

	}

	public void delete(long id) {
		bookDao.delete(id);

	}

}
