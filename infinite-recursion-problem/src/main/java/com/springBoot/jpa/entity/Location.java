package com.springBoot.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
//@ToString(exclude = {"users"})
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String locationName;
	
	@ToString.Exclude
	@OneToMany(mappedBy = "location", cascade = CascadeType.PERSIST)
	private List<User> users;
	
	@JsonManagedReference
	public List<User> getUsers(){
		return this.users;
	}
}
