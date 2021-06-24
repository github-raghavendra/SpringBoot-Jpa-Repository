package com.online.bookshop.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private LocalDate Doj;
	private LocalDateTime created_at;
	private LocalDateTime updated_at;
	
	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "customer")
	private ShoppingCart shoppingCart;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	private List<UserShipping> userShippingList;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
	private List<UserPayment> userPaymentList;
	
	@OneToMany(mappedBy = "customer")
	private List<Order> orderList;
	

}
