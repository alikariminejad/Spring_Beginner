package com.in28minutes.learn_spring_aop.aopexample.business;

import com.in28minutes.learn_spring_aop.aopexample.data.DataService2;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService2 {
    private DataService2 dataService2;

    public BusinessService2(DataService2 dataService2){
        this.dataService2 = dataService2;
    }
    public int calculateMax() throws InterruptedException {
        int[] data =  dataService2.retrieveData();
//        throw new RuntimeException("Something went wrong!!!");
        Thread.sleep(30);
        return Arrays.stream(data).max().orElse(0);
    }
}
