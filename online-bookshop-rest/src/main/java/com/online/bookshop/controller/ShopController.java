package com.online.bookshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.bookshop.model.User;

@RestController
@RequestMapping("/users")
public class ShopController {

	@PostMapping
	public ResponseEntity<User> createNewUserDemo(){
		return null;
	}
	
	//@PostMapping
	public ResponseEntity<User> createNewUser(@RequestBody User user){
		return null;
	}
	
	@GetMapping
	public ResponseEntity<User> getUserById(@RequestBody User user){
		return null;
	}
}
