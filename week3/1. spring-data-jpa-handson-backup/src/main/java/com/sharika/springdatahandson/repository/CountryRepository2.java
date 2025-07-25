package com.sharika.springdatahandson.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sharika.springdatahandson.model.Country;

@Repository
public interface CountryRepository2 extends JpaRepository<Country, String> {

	List<Country> findByNameContaining(String name);
	
	List<Country> findByNameContainingOrderByNameAsc(String name);
	
	List<Country> findByNameStartingWithOrderByNameAsc(String alphabet);
	
}
