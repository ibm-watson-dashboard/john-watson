package br.com.lepsistemas.johnwatson.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lepsistemas.johnwatson.api.HelloApi;

@RestController("/hello")
public class HelloController {
	
	@Autowired
	private HelloApi api;
	
	@GetMapping
	public String hello() {
		return api.hello();
	}

}
