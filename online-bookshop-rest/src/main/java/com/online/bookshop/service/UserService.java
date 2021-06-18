package com.online.bookshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.online.bookshop.dao.UserRepository;
import com.online.bookshop.dao.UserShippingRepository;
import com.online.bookshop.model.User;
import com.online.bookshop.model.UserShipping;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(isolation = Isolation.READ_COMMITTED)
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired UserShippingRepository userShippingRepository;
	
	
	public User createUser(User user) {
		User savedUser = userRepository.save(user);
		log.info("user is saved successfully {}", user);
		return savedUser;
	}
	
	public User getUserByUserId(String userId) {
		Optional<User> optional = userRepository.findByUserId(userId);
		User user = optional.get();
		return user;
	}
	
	public UserShipping addNewUserShippingAddress(String userId, UserShipping shippingAddress) {
		Optional<User> optional = userRepository.findByUserId(userId);
		User user = optional.get();
		shippingAddress.setUser(user);
		UserShipping savedUserShipping = userShippingRepository.save(shippingAddress);
		return savedUserShipping;
		
	}
	
	public List<UserShipping> getAllUserShippings(String userId) {
		Optional<User> optional = userRepository.findByUserId(userId);
		User user = optional.get();
		List<UserShipping> userShippings = user.getUserShippingList();
		return userShippings;
		
	}
	
	
}
















