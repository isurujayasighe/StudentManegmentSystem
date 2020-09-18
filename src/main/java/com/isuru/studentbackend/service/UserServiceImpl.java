package com.isuru.studentbackend.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isuru.studentbackend.model.User;
import com.isuru.studentbackend.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Collection<User> getAllUsers() {
		
		ArrayList<User> users = new ArrayList<>();
		
		userRepository.findAll().forEach(users::add);
		
		return users;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

}
