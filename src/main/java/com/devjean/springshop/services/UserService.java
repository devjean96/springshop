package com.devjean.springshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devjean.springshop.entities.User;
import com.devjean.springshop.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findByUserId(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
