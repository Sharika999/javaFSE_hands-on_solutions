package com.sharika.springdatahandson.service.exception;

public class CountryNotFoundException extends Exception{

	public CountryNotFoundException()
	{
		super("There is no Country Present with ID ");
	}
	
}
