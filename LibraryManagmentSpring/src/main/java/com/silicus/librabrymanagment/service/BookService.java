package com.silicus.librabrymanagment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.silicus.librabrymanagment.entity.Book;

@Service
public interface BookService {

	void save(Book book);

	Book get(long id);

	List<Book> list();

	Object update(long id, Book book);

	void delete(long id);
}
