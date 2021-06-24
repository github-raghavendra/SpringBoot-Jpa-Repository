package com.springBoot.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.jpa.entity.Location;
import com.springBoot.jpa.service.LocationService;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@GetMapping
	public ResponseEntity<Location> getAllLocation(){
		return null;
	}
	
	
}
