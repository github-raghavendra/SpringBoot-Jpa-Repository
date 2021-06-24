package com.online.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	
	@Autowired

	@GetMapping("/addToCart")
	public void getCart() {
		
	}
	
	@PostMapping("/addToCart")
	public void addToCart() {
		
	}
	
	
}
