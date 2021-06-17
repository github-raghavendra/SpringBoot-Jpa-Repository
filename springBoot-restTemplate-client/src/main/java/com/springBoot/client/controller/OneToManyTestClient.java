package com.springBoot.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OneToManyTestClient {

	@Autowired
	private RestTemplate restTemplate;
	
	public void m1() {
		
	}
}
