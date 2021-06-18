package com.online.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.bookshop.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
