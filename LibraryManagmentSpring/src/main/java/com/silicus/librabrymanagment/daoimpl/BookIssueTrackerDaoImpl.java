package com.silicus.librabrymanagment.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.silicus.librabrymanagment.dao.BookIssueTrackerDao;
import com.silicus.librabrymanagment.entity.BookIssueTracker;

@Repository
@Transactional
public class BookIssueTrackerDaoImpl implements BookIssueTrackerDao {

	@Autowired
	private SessionFactory sessionFactory;


	public void save(BookIssueTracker bookIssueTracker) {
		sessionFactory.getCurrentSession().save(bookIssueTracker);

	}

	public BookIssueTracker get(long id) {
		return (BookIssueTracker) sessionFactory.getCurrentSession().get(BookIssueTracker.class, id);

	}

	public List<BookIssueTracker> list() {
		Session session = sessionFactory.getCurrentSession();
		List bookIssueTrackerRecordList = session.createCriteria(BookIssueTracker.class).list();
		return bookIssueTrackerRecordList;
	}

	public Object update(long id, BookIssueTracker bookIssueTracker) {
		Session session = sessionFactory.getCurrentSession();
		BookIssueTracker bookIssueTracker1 = (BookIssueTracker) session.byId(BookIssueTracker.class).load(id);
		bookIssueTracker1.setId(bookIssueTracker.getId());
		bookIssueTracker1.setDateOfIssue(bookIssueTracker.getDateOfIssue());
		bookIssueTracker1.setExpDate(bookIssueTracker.getExpDate());
		bookIssueTracker1.setIssuer(bookIssueTracker.getIssuer());
		bookIssueTracker1.setBook(bookIssueTracker.getBook());
		bookIssueTracker1.setUser(bookIssueTracker.getUser());
		session.flush();
		return bookIssueTracker1;
	}

	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		BookIssueTracker bookIssueTracker = (BookIssueTracker) session.byId(BookIssueTracker.class);
		session.delete(bookIssueTracker);

	}

}
