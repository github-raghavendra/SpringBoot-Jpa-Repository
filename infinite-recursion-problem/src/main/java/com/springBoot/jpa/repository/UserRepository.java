package com.springBoot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
