package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
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
		return new Person("Jack", 23, new Address("Main street", "Utretch"));
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); // name,age, address
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3); // name,age, address
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("unknown street", "Monich");
	}
	@Bean(name = "address3")
	public Address address3() {
		return new Address("paper street", "Texas");
	}
}
