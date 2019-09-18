package com.silicus.librabrymanagment.service;

import java.util.List;

import com.silicus.librabrymanagment.entity.BookIssueTracker;

public interface BookIssueTrackerService {

	void save(BookIssueTracker bookIssueTracker);
	   BookIssueTracker get(long id);
	   List<BookIssueTracker> list();
	   Object update(long id, BookIssueTracker bookIssueTracker);
	   void delete(long id);
}
