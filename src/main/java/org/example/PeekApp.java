package org.example;

import java.util.List;

public class PeekApp {
    public static void main(String[] args) {
        var names = List.of("e", "a", "c", "k", "z");

        names.stream()
                .peek(name -> System.out.println("Before " + name))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("After " + name))
                .forEach(System.out::println);
    }
}
