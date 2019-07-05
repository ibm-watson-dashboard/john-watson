package br.com.lepsistemas.johnwatson.spring.controller;

public class HelloResponse {
	
	private String hello;
	
	public HelloResponse(String hello) {
		this.hello = hello;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}
