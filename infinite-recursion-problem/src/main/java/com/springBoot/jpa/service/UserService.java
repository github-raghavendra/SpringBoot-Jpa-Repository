package com.springBoot.jpa.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.jpa.entity.User;
import com.springBoot.jpa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		List<User> users = userRepository.findAll();
		return users;
	}
	
	public User getUserById(Long id) {
		User user = userRepository.getById(id);
		return user;
	}
	
	public User createNewUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}
	
	public User updateUser(Long id, User Updateduser) {
		User savedUser = userRepository.getById(id);
		BeanUtils.copyProperties(Updateduser, savedUser);
		User user = userRepository.save(savedUser);
		return user;
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
