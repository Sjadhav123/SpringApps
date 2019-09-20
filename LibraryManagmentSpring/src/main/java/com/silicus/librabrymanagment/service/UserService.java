package com.silicus.librabrymanagment.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.silicus.librabrymanagment.entity.User;

@Service
public interface UserService {

	void save(User user);

	User get(long id);

	List<User> list();

	Object update(long id, User user);

	void delete(long id);
}
