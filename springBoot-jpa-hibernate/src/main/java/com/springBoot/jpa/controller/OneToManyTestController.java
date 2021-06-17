package com.springBoot.jpa.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springBoot.jpa.model.Guide;
import com.springBoot.jpa.model.Student;
import com.springBoot.jpa.service.GuideService;
import com.springBoot.jpa.service.StudentService;

@RestController
public class OneToManyTestController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private GuideService guideService;

	@GetMapping("/t1")
	public ResponseEntity<List<Student>> test1() {
		List<Student> students = studentService.save();
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("headerKey", "headerValue");

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		return ResponseEntity.created(location).headers(responseHeaders).allow(HttpMethod.GET).body(students);
	}
	
	@GetMapping("/t2")
	public ResponseEntity<Guide> test2() {
		Guide guide = guideService.save();
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("headerKey", "headerValue");

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		return ResponseEntity.created(location).headers(responseHeaders).body(guide);
	}
}
