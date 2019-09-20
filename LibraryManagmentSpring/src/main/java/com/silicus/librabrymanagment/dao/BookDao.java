package com.silicus.librabrymanagment.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.silicus.librabrymanagment.entity.Book;


@Repository
public interface BookDao {

	  void save(Book book);
	   Book get(long id);
	   List<Book> list();
	   Object update(long id, Book book);
	   void delete(long id);
}
