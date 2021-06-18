package com.online.bookshop.helper;

import com.online.bookshop.model.User;

public class UserHelper {
	
	public static User createNewUser() {
		
		User user = new User();
		user.setUsername("org.raghav");
		user.setPassword("123");
		user.setFirstName("Raghavendra");
		user.setLastName("Rai");
		user.setEmail("org.raghav@gmail.com");
		user.setPhone("+91 7065882464");
		
		return user;
	}

}
