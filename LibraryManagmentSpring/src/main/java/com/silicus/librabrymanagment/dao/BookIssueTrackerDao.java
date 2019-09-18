package com.silicus.librabrymanagment.dao;

import java.util.List;

import com.silicus.librabrymanagment.entity.BookIssueTracker;

public interface BookIssueTrackerDao {

	void save(BookIssueTracker bookIssueTracker);
	   BookIssueTracker get(long id);
	   List<BookIssueTracker> list();
	   Object update(long id, BookIssueTracker bookIssueTracker);
	   void delete(long id);
}
