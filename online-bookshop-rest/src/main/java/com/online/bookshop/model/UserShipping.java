package com.online.bookshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class UserShipping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userShippingName;
	private String userShippingStreet1;
	private String userShippingStreet2;
	private String userShippingCity;
	private String userShippingState;
	private String userShippingCountry;
	private String userShippingZipcode;
	private boolean userShippingDefault;
	
	@ManyToOne
	@JsonIgnore//very very important to prevent infinite loop
	//@JoinColumn(name = "user_id") // automatically created by hibernate, may or may not be used.
	private User user;

}
