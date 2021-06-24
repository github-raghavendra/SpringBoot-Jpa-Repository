package com.springBoot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.jpa.entity.Location;
import com.springBoot.jpa.entity.Post;
import com.springBoot.jpa.entity.User;
import com.springBoot.jpa.service.LocationService;
import com.springBoot.jpa.service.PostService;
import com.springBoot.jpa.service.UserService;

@RestController
public class TestController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/t1")
	public ResponseEntity<Location> test1(){
		
		List<Post> posts = Healper.getAllPosts();
		List<User> users = Healper.getUserList();
		
		User u1 = users.get(0);
		u1.setPosts(posts);
		
		Location loc = Healper.getNewLocation();
		loc.setUsers(users);
		locationService.createNewLocation(loc);
		
		return ResponseEntity.ok().body(loc);
	}
	
	@GetMapping("/t2")
	public ResponseEntity<User> test2(){
		
		List<Post> posts = Healper.getAllPosts();
		List<User> users = Healper.getUserList();
		
		User u1 = users.get(0);
		u1.setPosts(posts);
		
		User user = userService.createNewUser(u1);
		
		return ResponseEntity.ok().body(user);
	}
	
}
