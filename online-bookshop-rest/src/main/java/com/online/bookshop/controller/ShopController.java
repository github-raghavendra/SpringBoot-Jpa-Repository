package com.online.bookshop.controller;

import java.net.URI;
import java.util.List;

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
import com.online.bookshop.model.ShippingAddress;
import com.online.bookshop.model.User;
import com.online.bookshop.model.UserShipping;
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

		User user = userService.getUserByUserId(userId);
		
		return ResponseEntity.ok().body(user);
	}
	
	@GetMapping("/userShipping1")
	public ResponseEntity<UserShipping> createNewUserShipping1() {
		
		String userId = "c1";
		UserShipping newShippingAddress1 = userHelper.getNewUserShipping1();
		UserShipping userShippingAddress = userService.addNewUserShippingAddress(userId, newShippingAddress1);
		
		return ResponseEntity.ok().body(userShippingAddress);
		
	}
	
	@GetMapping("/userShipping2")
	public ResponseEntity<UserShipping> createNewUserShipping2() {
		
		String userId = "c1";
		UserShipping newShippingAddress2 = userHelper.getNewUserShipping2();
		UserShipping userShippingAddress = userService.addNewUserShippingAddress(userId, newShippingAddress2);
		
		return ResponseEntity.ok().body(userShippingAddress);
		
	}
	
	@GetMapping("/userShippingList")
	public ResponseEntity<List<UserShipping>> getUserShippingList() {
		
		String userId = "c1";
		List<UserShipping> allUserShippings = userService.getAllUserShippings(userId);
		return ResponseEntity.ok().body(allUserShippings);
		
	}
	
}

















