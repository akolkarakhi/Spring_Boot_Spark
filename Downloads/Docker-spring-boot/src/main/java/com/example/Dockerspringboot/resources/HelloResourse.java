package com.example.Dockerspringboot.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker")
public class HelloResourse {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Docker";
	}
	
}
