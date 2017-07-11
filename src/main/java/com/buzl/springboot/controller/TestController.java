package com.buzl.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/test")
	public long test(int times) {

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			restTemplate.getForObject("http://localhost:8088/likeName?name=bu", String.class);
		}

		return System.currentTimeMillis() - startTime;

	}
}
