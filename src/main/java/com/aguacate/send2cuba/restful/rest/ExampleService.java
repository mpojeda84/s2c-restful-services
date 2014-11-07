package com.aguacate.send2cuba.restful.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleService {

	@RequestMapping("/")
	public String home() {
		return "Hello spring boot world";
	}


}