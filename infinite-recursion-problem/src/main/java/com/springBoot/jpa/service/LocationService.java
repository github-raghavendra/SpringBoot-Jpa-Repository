package com.springBoot.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.jpa.entity.Location;
import com.springBoot.jpa.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	public List<Location> getAllLocations(){
		List<Location> locations = locationRepository.findAll();
		return locations;
	}
	
	public Location getLocationById(Long id) {
		Location location = locationRepository.getById(id);
		return location;
	}
	
	public Location createNewLocation(Location location) {
		Location savedLocation = locationRepository.save(location);
		return savedLocation;
	}
	
}
