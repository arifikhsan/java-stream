package org.example;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

@SuppressWarnings("ALL")
public class PrimitiveApp {
    public static void main(String[] args) {
        var intStream = IntStream.range(1, 100);
        intStream.forEach(System.out::println);

        var longStream = LongStream.of(1, 2, 3, 4);
        var doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();

        IntStream.range(1, 100).average().ifPresent(System.out::println);
        IntStream.range(0, 100).mapToObj(number -> "Number: " + number).forEach(System.out::println);
    }
}
