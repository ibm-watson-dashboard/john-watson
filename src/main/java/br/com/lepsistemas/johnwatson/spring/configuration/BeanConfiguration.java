package br.com.lepsistemas.johnwatson.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.lepsistemas.johnwatson.api.HelloApi;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public HelloApi helloApi() {
		return new HelloApi();
	}

}
