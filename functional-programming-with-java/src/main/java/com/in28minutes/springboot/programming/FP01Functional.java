package com.in28minutes.springboot.programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args){
        printAllNumbersInListFunctional(List.of(1,24,123,141,2525,23,654,778,34));
    }

    public static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
       numbers.stream().forEach(FP01Functional::print); // Method Reference
    }
}
