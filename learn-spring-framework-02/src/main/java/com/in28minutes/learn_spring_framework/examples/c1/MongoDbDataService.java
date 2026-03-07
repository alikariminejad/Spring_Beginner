package com.in28minutes.learn_spring_framework.examples.c1;


import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService{

	@Override
	public int[] retrieveData() {
		return new int[] {11, 22, 33, 432, 2324};
	}

}
