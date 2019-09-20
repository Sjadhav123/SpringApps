package com.silicus.librabrymanagment.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.silicus.librabrymanagment.entity.User;

@Repository
public interface UserDao {

	
	 void save(User user);
	 User get(long id);
	   List<User> list();
	   Object update(long id, User user);
	   void delete(long id);
}
