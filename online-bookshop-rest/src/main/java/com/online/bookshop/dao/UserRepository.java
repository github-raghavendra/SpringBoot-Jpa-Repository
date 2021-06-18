package com.online.bookshop.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.bookshop.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUserId(String userId);
}
