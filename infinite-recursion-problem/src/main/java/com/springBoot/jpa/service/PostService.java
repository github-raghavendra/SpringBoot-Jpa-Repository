package com.springBoot.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.jpa.entity.Post;
import com.springBoot.jpa.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getAllPosts(){
		List<Post> posts = postRepository.findAll();
		return posts;
	}
	
	public Post getPostById(Long id) {
		Post post = postRepository.getById(id);
		return post;
	}
	
	public Post createNewPost(Post post) {
		Post savedPost = postRepository.save(post);
		return savedPost;
	}
	
}
