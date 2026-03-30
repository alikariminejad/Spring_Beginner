package com.in28minutes.springboot.programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1, 24, 123, 141, 2525, 23, 654, 778, 34);
//        printAllNumbersInListFunctional(numbers);
//        printEvenNumbersInListFunctional(numbers);
        printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    public static boolean isEven(int number){
            return number % 2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
       numbers.stream().forEach(System.out::println); // Method Reference
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number-> number%2==0) // Lambda expression
                .forEach(System.out::println); // Method Reference
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number-> number%2==0)
                .map(number -> number * number)// Lambda expression
                .forEach(System.out::println); // Method Reference
    }
}
