package com.aruns.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloResource {

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "hello "+name+"  !! \t (\"hello-service)\"";
		
	}
}
