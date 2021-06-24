package com.springBoot.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.jpa.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
}
