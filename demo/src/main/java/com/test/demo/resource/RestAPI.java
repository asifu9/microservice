package com.test.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/hello")
public class RestAPI {

	@GetMapping
	public String greeting() {
		return "String";
	}
}
