package com.in28minutes.springboot.programming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1, 24, 123, 141, 2525, 23, 654, 778, 34);
//        printOddNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                                        "Kubernetes");
//        courses.stream().forEach(System.out::println);
//        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
        courses.stream().filter(course->course.length() >= 4).forEach(System.out::println);
    }

    public static boolean isEven(int number){
            return number % 2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
       numbers.stream().forEach(System.out::println); // Method Reference
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number-> number%2!=0) // Lambda expression
                .forEach(System.out::println); // Method Reference
    }
}
