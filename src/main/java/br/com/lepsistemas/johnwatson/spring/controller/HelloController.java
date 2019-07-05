package br.com.lepsistemas.johnwatson.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lepsistemas.johnwatson.api.HelloApi;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private HelloApi api;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> hello(@PathVariable String id) {
		String hello = api.hello(id);
		return ResponseEntity.status(HttpStatus.OK).body(new DataResponse(id, new HelloResponse(hello)));
	}

}
