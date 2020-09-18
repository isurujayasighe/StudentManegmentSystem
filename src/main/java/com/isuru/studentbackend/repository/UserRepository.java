package com.isuru.studentbackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.isuru.studentbackend.model.User;

public interface UserRepository extends CrudRepository<User, String>{
}
