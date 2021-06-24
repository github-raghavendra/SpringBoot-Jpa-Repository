package com.springBoot.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = {"posts"})
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private int age;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "location_id")
	private Location location;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	private List<Post> posts;
	
	@JsonBackReference
	public Location getLocation(){
		return this.location;
	}
	
	@JsonManagedReference
	public List<Post> getPosts(){
		return this.posts;
	}
}

