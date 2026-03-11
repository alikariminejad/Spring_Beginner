package com.in28minutes.learn_spring_framework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
class ClassA{
	
}


@Component
@Lazy
class ClassB{
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		//Logic
		System.out.println("Some Initalization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Doing STH!");
	}
}

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("Initialization of context is completed");
			
			context.getBean(ClassB.class).doSomething();
		}
	}

}
