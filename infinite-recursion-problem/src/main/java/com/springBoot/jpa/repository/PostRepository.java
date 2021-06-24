package com.springBoot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jpa.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
