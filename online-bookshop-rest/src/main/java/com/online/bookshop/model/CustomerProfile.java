package com.online.bookshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CustomerProfile {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fullName;
	
	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
}
