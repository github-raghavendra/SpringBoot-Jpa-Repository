package com.online.bookshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.bookshop.dao.UserRepository;
import com.online.bookshop.model.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public User createUser(User user) {
		User savedUser = userRepository.save(user);
		log.info("user is saved successfully {}", user);
		return savedUser;
	}
	
}
