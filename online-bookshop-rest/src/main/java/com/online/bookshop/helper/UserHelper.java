package com.online.bookshop.helper;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.online.bookshop.model.User;

@Component
public class UserHelper {
	
	public User getNewUserForDemo() {
		
		User user = new User();
		user.setUserId(UUID.randomUUID().toString());
		user.setUsername("org.raghav");
		user.setPassword("123");
		user.setFirstName("Raghavendra");
		user.setLastName("Rai");
		user.setEmail("org.raghav@gmail.com");
		user.setPhone("+91 7065882464");
		
		return user;
	}

}
