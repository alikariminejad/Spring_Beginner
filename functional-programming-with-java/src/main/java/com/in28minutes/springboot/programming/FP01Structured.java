package com.in28minutes.springboot.programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args){
        printAllNumbersInListStructured(List.of(1,24,123,141,2525,23,654,778,34));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
