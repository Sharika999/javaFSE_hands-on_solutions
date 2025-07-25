package com.sharika.springdatahandson.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharika.springdatahandson.model.Country;
import com.sharika.springdatahandson.repository.CountryRepository2;
import com.sharika.springdatahandson.service.exception.CountryNotFoundException;

@Service
public class CountryService_QueryMethods {

	@Autowired
	public CountryRepository2 countryRepository;

	@Transactional
	public List<Country> findByCodeName(String name) throws CountryNotFoundException {
		List<Country> countries = countryRepository.findByNameContaining(name);
		if (countries.isEmpty()) {
			throw new CountryNotFoundException();
		}
		return countries;
	}

	@Transactional
	public List<Country> findByCodeNameAscendingOrder(String name) throws CountryNotFoundException {
		List<Country> countries = countryRepository.findByNameContainingOrderByNameAsc(name);
		if (countries.isEmpty()) {
			throw new CountryNotFoundException();
		}
		return countries;
	}

	@Transactional
	public List<Country> findByCodeNameStartingWith(String alphabet) throws CountryNotFoundException {
		List<Country> countries = countryRepository.findByNameStartingWithOrderByNameAsc(alphabet);
		if (countries.isEmpty()) {
			throw new CountryNotFoundException();
		}
		return countries;
	}

}
