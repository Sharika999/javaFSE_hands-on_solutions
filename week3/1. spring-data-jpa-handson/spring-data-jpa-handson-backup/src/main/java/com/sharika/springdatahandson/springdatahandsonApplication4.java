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
public class springdatahandsonApplication4 {

	private static final Logger LOGGER = LoggerFactory.getLogger(springdatahandsonApplication4.class);

	private static CountryService countryService;

	private static void testUpdateCountry() {

		Country country=null;
		
		LOGGER.info("Start");
		try {
			countryService.updateCountry("JA", "Japan");
			
			country = countryService.findCountryByCode("JA");
		} catch (CountryNotFoundException e) {
			LOGGER.info(e.getMessage()+"JA");
		}
		LOGGER.debug("countries={}", country);
		LOGGER.info("End");

	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(springdatahandsonApplication4.class, args);
		countryService = context.getBean(CountryService.class);
		LOGGER.info("Inside main");
		testUpdateCountry();
	}

}
