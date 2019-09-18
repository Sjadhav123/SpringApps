package com.silicus.librabrymanagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.silicus.librabrymanagment.entity.Book;
import com.silicus.librabrymanagment.service.BookService;
//save the record
@RestController
public class BookController {
//saved
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/createBook",method=RequestMethod.POST)
	public void save(@RequestBody Book book){
		bookService.save(book);
		
	}
}
