package com.online.bookshop.helper;

import org.springframework.stereotype.Component;

import com.online.bookshop.model.ShippingAddress;
import com.online.bookshop.model.User;
import com.online.bookshop.model.UserBilling;
import com.online.bookshop.model.UserPayment;
import com.online.bookshop.model.UserShipping;

@Component
public class UserHelper {

	public User getNewUserForDemo() {

		User user = new User();
		// user.setUserId(UUID.randomUUID().toString());
		user.setPublicUserId("c1");
		user.setUsername("org.raghav");
		user.setPassword("123");
		//user.setFirstName("Raghavendra");
		//user.setLastName("Rai");
		user.setEmail("org.raghav@gmail.com");
		user.setPhone("+91 7065882464");

		return user;
	}

	public UserShipping getNewUserShipping1() {
		UserShipping userShipping = new UserShipping();
		userShipping.setUserShippingName("Raghavendra Rai");
		userShipping.setUserShippingStreet1("Sri Ram Vihar Colony");
		userShipping.setUserShippingStreet2("civil line 135");
		userShipping.setUserShippingCity("Ballia");
		userShipping.setUserShippingState("UP");
		userShipping.setUserShippingCountry("India");
		userShipping.setUserShippingZipcode("277001");
		userShipping.setUserShippingDefault(true);
		return userShipping;
	}

	public UserShipping getNewUserShipping2() {
		UserShipping userShipping = new UserShipping();
		userShipping.setUserShippingName("Raghavendra Rai");
		userShipping.setUserShippingStreet1("A-574/3B New Ashok Nagar New Delhi");
		userShipping.setUserShippingStreet2("Near Mata Mandir");
		userShipping.setUserShippingCity("Delhi");
		userShipping.setUserShippingState("Delhi");
		userShipping.setUserShippingCountry("India");
		userShipping.setUserShippingZipcode("110096");
		userShipping.setUserShippingDefault(true);
		return userShipping;
	}

	public ShippingAddress getNewShippingAddress1() {
		ShippingAddress shippingAddress = new ShippingAddress();
		shippingAddress.setShippingAddressName("Raghavendra Rai");
		shippingAddress.setShippingAddressStreet1("A-574 New Ashok Nagar");
		shippingAddress.setShippingAddressStreet2("Near DPA Public School");
		shippingAddress.setShippingAddressCity("New Delhi");
		shippingAddress.setShippingAddressState("Delhi");
		shippingAddress.setShippingAddressCountry("India");
		shippingAddress.setShippingAddressZipcode("110096");
		return shippingAddress;
	}
	
	public ShippingAddress getNewShippingAddress2() {
		ShippingAddress shippingAddress = new ShippingAddress();
		shippingAddress.setShippingAddressName("Raghavendra Rai");
		shippingAddress.setShippingAddressStreet1("Gram - Bhanti");
		shippingAddress.setShippingAddressStreet2("Post - Banahara");
		shippingAddress.setShippingAddressCity("Distric - Ballia");
		shippingAddress.setShippingAddressState("UP");
		shippingAddress.setShippingAddressCountry("India");
		shippingAddress.setShippingAddressZipcode("277002");
		return shippingAddress;
	}

	public UserBilling getUserBilling1() {
		
		UserBilling userBilling = new UserBilling();
		userBilling.setUserBillingName(null);
		userBilling.setUserBillingStreet1(null);
		userBilling.setUserBillingStreet2(null);
		userBilling.setUserBillingCity(null);
		userBilling.setUserBillingState(null);
		userBilling.setUserBillingCountry(null);
		userBilling.setUserBillingZipcode(null);
		
		return userBilling;
	}

	public UserBilling getUserBilling2() {
		UserBilling userBilling = new UserBilling();
		userBilling.setUserBillingName(null);
		userBilling.setUserBillingStreet1(null);
		userBilling.setUserBillingStreet2(null);
		userBilling.setUserBillingCity(null);
		userBilling.setUserBillingState(null);
		userBilling.setUserBillingCountry(null);
		userBilling.setUserBillingZipcode(null);
		
		return userBilling;
	}
	
	public UserPayment getUserPayment1() {
		UserPayment userPayment = new UserPayment();
		userPayment.setType("Visa");
		userPayment.setCardName("PLATINUM");
		userPayment.setCardNumber("5241-4331-7248-8000");
		userPayment.setExpiryMonth(3);
		userPayment.setExpiryYear(24);
		userPayment.setCvc(729);
		userPayment.setHolderName("Raghavendra Rai");
		userPayment.setDefaultPayment(false);
		return userPayment;
	}
	
	public UserPayment getUserPayment2() {
		UserPayment userPayment = new UserPayment();
		userPayment.setType("Visa");
		userPayment.setCardName("Millenia");
		userPayment.setCardNumber("7981-9331-5241-7801");
		userPayment.setExpiryMonth(3);
		userPayment.setExpiryYear(26);
		userPayment.setCvc(329);
		userPayment.setHolderName("Raghavendra Rai");
		userPayment.setDefaultPayment(true);
		return userPayment;
	}
	
	
}


