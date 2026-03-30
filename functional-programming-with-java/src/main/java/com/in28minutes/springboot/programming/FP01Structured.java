package com.in28minutes.springboot.programming;

import java.util.ArrayList;
import java.util.List;

public class FP01Structured {
    public static void main(String[] args){
        List <Integer> numbers = List.of(1,24,123,141,2525,23,654,778,34);
//        printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for(int number:numbers){
            System.out.println(number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for(int number:numbers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }
}
