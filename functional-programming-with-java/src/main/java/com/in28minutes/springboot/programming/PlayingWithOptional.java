package com.in28minutes.springboot.programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Orange", "Pear", "Strawberry");
        Predicate<? super String> predicate = s -> s.startsWith("P");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        System.out.println(optional.get());

        Optional<String> opt1 = Optional.of("apple");
        Optional<String> optEmpty =  Optional.empty();
    }

}
