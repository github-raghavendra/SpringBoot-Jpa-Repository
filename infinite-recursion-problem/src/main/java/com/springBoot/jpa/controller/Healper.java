package com.springBoot.jpa.controller;

import java.util.ArrayList;
import java.util.List;

import com.springBoot.jpa.entity.Location;
import com.springBoot.jpa.entity.Post;
import com.springBoot.jpa.entity.User;

public class Healper {

	public static Location getNewLocation() {
		Location location = new Location();
		location.setLocationName("New Ashok Nagar");
		return location;
	}
	
	public static User getNewUser() {
		User user = new User();
		user.setName("Raghavendra Rai");
		user.setAge(33);
		return user;
	}
	
	public static List<User> getUserList(){
		List<User> users = new ArrayList<>();
		
		User user1 = new User();
		user1.setName("Raghavendra Rai");
		user1.setAge(33);
		users.add(user1);
		
		User user2 = new User();
		user2.setName("Ramesh Kumar Singh");
		user2.setAge(34);
		users.add(user2);
		
		return users;
	}
	
	public static Post getNewPost() {
		Post post = new Post();
		post.setPostDetails("This is my post 1");
		return post;
	}
	
	public static List<Post> getAllPosts(){
		
		List<Post> posts = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setPostDetails("This is my post 1");
		posts.add(post1);
		
		Post post2 = new Post();
		post2.setPostDetails("This is my post 1");
		posts.add(post2);
		
		return posts;
	}
	
	
	
}
