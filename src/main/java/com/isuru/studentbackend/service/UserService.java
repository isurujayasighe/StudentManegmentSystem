package com.isuru.studentbackend.service;

import java.util.Collection;

import com.isuru.studentbackend.model.User;

public interface UserService {
	
	Collection<User> getAllUsers();
	
	void saveUser (User user);

}
