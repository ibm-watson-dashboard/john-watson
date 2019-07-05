package br.com.lepsistemas.johnwatson.spring.controller;

public class DataResponse {
	
	private String id;
	private HelloResponse data;
	
	public DataResponse(String id, HelloResponse data) {
		this.id = id;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HelloResponse getData() {
		return data;
	}

	public void setData(HelloResponse data) {
		this.data = data;
	}

}
