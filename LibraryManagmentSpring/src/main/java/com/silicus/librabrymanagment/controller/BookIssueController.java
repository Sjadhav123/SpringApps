package com.silicus.librabrymanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.silicus.librabrymanagment.entity.BookIssueTracker;
import com.silicus.librabrymanagment.serviceimpl.BookIssueTrackerServiceImpl;

@RestController
@RequestMapping("/bookIssueController")
public class BookIssueController {

	@Autowired
	private BookIssueTrackerServiceImpl bookIssueService;
	
	@RequestMapping(value="/createBookIssueRecord",method=RequestMethod.POST)
	public void save(@RequestBody BookIssueTracker bookIssueTracker){
		bookIssueService.save(bookIssueTracker);
		
	}
	
	
	@RequestMapping(value="/getBookIssueRecord",method=RequestMethod.GET)
	public BookIssueTracker getBook(@PathVariable("id")long id){
		return bookIssueService.get(id);
	}
	
	
	@RequestMapping(value="/getAllBookIssueRecords",method=RequestMethod.GET)
	public List getAllBooks(){
		return bookIssueService.list();
	}
	
	@RequestMapping(value="/updateBookIssueRecord",method=RequestMethod.PUT)
	public Object updateBook(@PathVariable("id") long id, @RequestBody BookIssueTracker bookIssueTracker){
		return bookIssueService.update(id,bookIssueTracker);
	}
	
	
	@RequestMapping(value="/deleteBookIssueRecord",method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable("id") long id){
		bookIssueService.delete(id);
		
	}
	
}
