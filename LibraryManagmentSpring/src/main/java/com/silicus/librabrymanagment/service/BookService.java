package com.silicus.librabrymanagment.service;

import java.util.List;

import com.silicus.librabrymanagment.entity.Book;

public interface BookService {

	void save(Book book);

	Book get(long id);

	List<Book> list();

	void update(long id, Book book);

	void delete(long id);
}
