package com.sharika.springdatahandson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sharika.springdatahandson.model.Country;
import com.sharika.springdatahandson.service.CountryService;
import com.sharika.springdatahandson.service.exception.CountryNotFoundException;

@SpringBootApplication
public class springdatahandsonApplication2 {

	private static final Logger LOGGER = LoggerFactory.getLogger(springdatahandsonApplication2.class);

	private static CountryService countryService;

	private static void getAllCountriesTest() {

		LOGGER.info("Start");
		Country country=null;
		try {
			country = countryService.findCountryByCode("INR");
		} catch (CountryNotFoundException e) {
			LOGGER.info(e.getMessage()+"INR");
		}
		LOGGER.debug("Country:{}", country);
		LOGGER.info("End");

	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(springdatahandsonApplication2.class, args);
		countryService = context.getBean(CountryService.class);
		LOGGER.info("Inside main");
		getAllCountriesTest();
	}

}
