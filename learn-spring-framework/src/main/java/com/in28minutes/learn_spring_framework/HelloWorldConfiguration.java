package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city) {};


@Configuration
public class HelloWorldConfiguration {

	
	@Bean
	public String name() {
		return "Ali";
	}
	
	@Bean
	public int age() {
		return 27;
	}
	
	@Bean
	public Person person() {
		return new Person("Jack", 23);
	}
	
	@Bean
	public Address address() {
		return new Address("unknown street", "Germany");
	}
}
