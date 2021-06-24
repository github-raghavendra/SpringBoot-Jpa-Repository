package com.springBoot.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.jpa.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
