package com.kalpana.microservice.limitsservice.controller;

import com.kalpana.microservice.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalpana.microservice.limitsservice.bean.Limits;

@RestController
public class LimitsController {
	@Autowired
	public Configuration configuration;
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimumLimit(),configuration.getMaximumLimit());}

}
