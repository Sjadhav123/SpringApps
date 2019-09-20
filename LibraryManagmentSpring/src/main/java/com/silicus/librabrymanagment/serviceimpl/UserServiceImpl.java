package com.silicus.librabrymanagment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silicus.librabrymanagment.dao.UserDao;
import com.silicus.librabrymanagment.entity.User;
import com.silicus.librabrymanagment.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public void save(User user) {
		userDao.save(user);
	}

	public User get(long id) {

		return userDao.get(id);

	}

	public List<User> list() {

		return userDao.list();
	}

	public Object update(long id, User user) {
		return userDao.update(id, user);

	}

	public void delete(long id) {
		userDao.delete(id);

	}

	
	
	
}
