package com.silicus.librabrymanagment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silicus.librabrymanagment.daoimpl.BookIssueTrackerDaoImpl;
import com.silicus.librabrymanagment.entity.BookIssueTracker;
import com.silicus.librabrymanagment.service.BookIssueTrackerService;

@Service
public class BookIssueTrackerServiceImpl implements BookIssueTrackerService {

	@Autowired
	private BookIssueTrackerDaoImpl bookIssueTrackerDaoImpl;
	
	public void save(BookIssueTracker bookIssueTracker) {
		 bookIssueTrackerDaoImpl.save(bookIssueTracker);

	}

	public BookIssueTracker get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BookIssueTracker> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object update(long id, BookIssueTracker bookIssueTracker) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
