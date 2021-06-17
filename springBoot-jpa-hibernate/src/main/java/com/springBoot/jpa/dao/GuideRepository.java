package com.springBoot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jpa.model.Guide;

public interface GuideRepository extends JpaRepository<Guide, Long>{

}
