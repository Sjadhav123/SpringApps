package com.silicus.librabrymanagment.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.silicus.librabrymanagment.dao.UserDao;
import com.silicus.librabrymanagment.entity.User;


@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
		System.out.println("USer saved successfully..!" + user.toString());
		
	}

	
	public User get(long id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
		
	}

	
	public List<User> list() {
		
		Session session = sessionFactory.getCurrentSession();
		List userList = session.createCriteria(User.class).list();
		return userList;

	}

	
	public Object update(long id, User user) {
		Session session = sessionFactory.getCurrentSession();
		User fUser = (User) session.byId(User.class).load(id);
		//fUser.setId(user.getId());
		fUser.setName(user.getName());
		fUser.setEmail(user.getEmail());
		fUser.setPhoneNumber(user.getPhoneNumber());
		fUser.setRoleId(user.getRoleId());
		
		
		session.flush();
		return fUser;
	}

	
	public void delete(long id) {
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.byId(User.class).load(id);
		session.delete(user);
		
	}

}
