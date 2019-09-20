package com.silicus.librabrymanagment.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.silicus.librabrymanagment.dao.BookDao;
import com.silicus.librabrymanagment.entity.Book;

@Repository
@Transactional
public class BookDaoIImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;



	public void save(Book book) {

		sessionFactory.getCurrentSession().save(book);
		System.out.println("Book saved successfully..!" + book.toString());
	}

	public Book get(long id) {
		return (Book) sessionFactory.getCurrentSession().get(Book.class, id);
	}

	public List<Book> list() {

		Session session = sessionFactory.getCurrentSession();
		List bookList = session.createCriteria(Book.class).list();
		return bookList;

	}

	public Object update(long id, Book book) {
		Session session = sessionFactory.getCurrentSession();
		Book book1 = (Book) session.byId(Book.class).load(id);
		book1.setAuthor(book.getAuthor());
		book1.setAvailable(book.isAvailable());
		book1.setId(book.getId());
		book1.setName(book.getName());
		book1.setRackName(book.getRackName());
		book1.setISBN(book.getISBN());
		session.flush();
		return book1;

	}

	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = (Book) session.byId(Book.class).load(id);
		session.delete(book);

	}

}
