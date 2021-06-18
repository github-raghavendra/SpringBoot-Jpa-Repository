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
public class OneToManyController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private GuideService guideService;

	@GetMapping("/t1")
	public ResponseEntity<List<Student>> saveStudent() {
		
		//getting List<Student> from service
		List<Student> students = studentService.save();

		//Preparing Response Header for the client
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("headerKey", "headerValue");
		
		//Making URI for getting saved resource
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		
		return ResponseEntity.created(location).headers(responseHeaders).allow(HttpMethod.GET).body(students);
		
	}
	
	@GetMapping("/t2")
	public ResponseEntity<Guide> saveGuide() {
		
		//Getting Guide object from the database
		Guide guide = guideService.save();
		
		//Preparing Response Header for the client
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("headerKey", "headerValue");

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		
		return ResponseEntity.created(location).headers(responseHeaders).body(guide);
	}
	
	@GetMapping("/t3")
	public ResponseEntity<Student> getAndUpdateGuide(){
		Student student = studentService.getAndUpdate();
		return ResponseEntity.ok().body(student);
	}
	
	@GetMapping("/t4")
	public ResponseEntity<List<Student>> getAllStudentsByGuide(){
		List<Student> students = guideService.getStudentByGuide();
		return ResponseEntity.ok().body(students);
		
	}
	
	@GetMapping("/t5")
	public ResponseEntity<Student> getAndUpdateStudent(){
		//guideService.
		//return ResponseEntity.ok().body(student);
		return null;
	}
	
	
}
