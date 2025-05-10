package com.org.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test")
public class RestTestController {
	private static Logger logger = LoggerFactory.getLogger(RestTestController.class);
	
	//emp with one record
	@GetMapping("/testImage")
	public String test() {
		System.out.println("This is a test controller");

		return "This is a test controllerr";
	}

}
