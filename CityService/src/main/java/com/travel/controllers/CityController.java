package com.travel.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
@RibbonClient(name = "travel-cityservice")
public class CityController {

	protected Logger logger = Logger.getLogger(CityController.class.getName());

	
	@RequestMapping("/city")
	public Iterable all() {
		logger.info("city-microservice all() invoked");
		List cities = new ArrayList<String>();
		cities.add("City1");
		cities.add("City2");
		cities.add("City3");
		cities.add("City4");
		cities.add("City5");
		cities.add("City6");
		logger.info("city-microservice all() found: ");
		return cities;
	}
	
	@RequestMapping("/info")
	public String info() {
		logger.info("city-microservice info() invoked");
	
		return "Endpoint URI ---   /city";
	}


	
}
