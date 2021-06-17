package com.springBoot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jpa.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
