package com.in28minutes.learn_spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {

    public int[] retrieveData(){
        return new int[] {1111,2222,3333,4444,5555,6666};
    }
}
