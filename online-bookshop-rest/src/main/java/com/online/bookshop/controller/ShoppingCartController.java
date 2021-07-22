package com.online.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.bookshop.model.Book;
import com.online.bookshop.model.CartItem;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
	
	@Autowired
	

	@GetMapping("/addToCart")
	public void getCart() {
		
	}
	
	@PostMapping("/addToCart")
	public void addToCart(@RequestBody Book book, int qty) {
		CartItem cartItem = new CartItem();
		cartItem.setBook(book);
		cartItem.setQty(qty);
		cartItem.setSubtotal(null);
	}
	
	
}
