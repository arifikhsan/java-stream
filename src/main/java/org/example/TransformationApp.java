package org.example;

import java.util.List;
import java.util.stream.Stream;

public class TransformationApp {
    public static void main(String[] args) {
        var names = List.of("Arif", "Ikhsan", "Udin");

        names.stream()
                .map(String::toUpperCase)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("---------------------");

        names.stream()
                .map(String::toUpperCase)
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value)) // jadi 3x
                .forEach(System.out::println);
    }
}
