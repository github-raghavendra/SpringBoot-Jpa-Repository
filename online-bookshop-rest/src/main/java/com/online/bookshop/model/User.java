package com.online.bookshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", nullable = false, updatable = false)
	private Long id;
	
	@Column(unique = true)
	private String publicUserId;//userId is strongly not recommended as fk is user_id already used by hb.
	
	@Column(unique = true)
	private String username;
	
	private String password;
	
	@Column(name="email", nullable = false, updatable = false)
	private String email;
	
	private String phone;
	
	private boolean enabled=true;
	
	/*
	 * @OneToOne(cascade = CascadeType.ALL, mappedBy = "user") private ShoppingCart
	 * shoppingCart;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "user") private
	 * List<UserShipping> userShippingList;
	 * 
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "user") private
	 * List<UserPayment> userPaymentList;
	 * 
	 * @OneToMany(mappedBy = "user") private List<Order> orderList;
	 */

}
