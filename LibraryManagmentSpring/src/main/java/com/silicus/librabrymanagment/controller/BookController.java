package com.silicus.librabrymanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.silicus.librabrymanagment.entity.Book;
import com.silicus.librabrymanagment.service.BookService;

@RestController
@RequestMapping("/BookController")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/createBook",method=RequestMethod.POST)
	public void save(@RequestBody Book book){
		bookService.save(book);
		
	}
	
	
	@RequestMapping(value="/getBook",method=RequestMethod.GET)
	public Book getBook(@PathVariable("id")long id){
		return bookService.get(id);
	}
	
	
	@RequestMapping(value="/getAllBooks",method=RequestMethod.GET)
	public List getAllBooks(){
		return bookService.list();
	}
	
	@RequestMapping(value="/updateBook",method=RequestMethod.PUT)
	public Object updateBook(@PathVariable("id") long id, @RequestBody Book book){
		return bookService.update(id,book);
	}
	
	
	@RequestMapping(value="/deleteBook",method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable("id") long id){
		bookService.delete(id);
		
	}
	
	
	
	
	
}


