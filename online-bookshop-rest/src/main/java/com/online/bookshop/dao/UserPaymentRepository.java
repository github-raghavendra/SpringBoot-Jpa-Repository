package com.online.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.bookshop.model.UserPayment;

public interface UserPaymentRepository extends JpaRepository<UserPayment, Long> {

}
