package com.sharika.springdatahandson;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sharika.springdatahandson.model.Country;
import com.sharika.springdatahandson.service.CountryService;
import com.sharika.springdatahandson.service.CountryService_QueryMethods;
import com.sharika.springdatahandson.service.exception.CountryNotFoundException;
/**
 * 
 * testing query methods findByNameLike
 *
 */
@SpringBootApplication
public class springdatahandsonApplication8 {

	private static final Logger LOGGER = LoggerFactory.getLogger(springdatahandsonApplication8.class);

	private static CountryService_QueryMethods countryService;

	private static void testDeleteCountry() {

		Country country=null;
		List<Country> countries=null;
		String alphabet="Z";	
		LOGGER.info("Start");
		try {		
			countries = countryService.findByCodeNameStartingWith(alphabet);
		} catch (CountryNotFoundException e) {
			LOGGER.info("The Country with starting with "+alphabet);
		}
		countries.forEach(c-> LOGGER.info(c.getCode()+" "+c.getName()));
		//LOGGER.debug("countries={}", countries);
		LOGGER.info("End");

	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(springdatahandsonApplication8.class, args);
		countryService = context.getBean(CountryService_QueryMethods.class);
		LOGGER.info("Inside main");
		testDeleteCountry();
	}

}
