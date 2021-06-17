package com.springBoot.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.springBoot.jpa.dao.GuideRepository;
import com.springBoot.jpa.model.Guide;
import com.springBoot.jpa.model.Student;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED)
public class GuideService {

	@Autowired
	private GuideRepository guideRepository;

	public Guide save() {
	
		List<Student> students = new ArrayList<>();

		Guide guide1 = new Guide();
		guide1.setFirstName("DeshRaj Singh");
		guide1.setLastName("Kiran");
		guide1.setAge(43);
		guide1.setExpertise("jpa");

		Student student1 = new Student();
		student1.setFirstName("raghavendra");
		student1.setLastName("Rai");
		student1.setAge(33);
		//student1.setGuide(guide1);
		students.add(student1);

		Student student2 = new Student();
		student2.setFirstName("Sandeep");
		student2.setLastName("Maurya");
		student2.setAge(34);
		//student2.setGuide(guide1);
		students.add(student2);
		
		guide1.setStudents(students);
		
		Guide savedGuide = guideRepository.save(guide1);
		
		return savedGuide;

	}

}
