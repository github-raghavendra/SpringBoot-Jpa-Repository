package com.online.bookshop.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.online.bookshop.helper.UserHelper;
import com.online.bookshop.model.User;
import com.online.bookshop.service.UserService;

@RestController
@RequestMapping("/users")
public class ShopController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserHelper userHelper;
	
	@GetMapping
	public ResponseEntity<User> createNewUserDemo(){
		
		User user = userHelper.getNewUserForDemo();
		
		User savedUser = userService.createUser(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		
		return ResponseEntity.created(location).body(savedUser);
	}
	
	@PostMapping
	public ResponseEntity<User> createNewUser(@RequestBody User user){
		return null;
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable String userId){
		return null;
	}
}
