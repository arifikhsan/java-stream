package org.example;

import java.util.stream.Stream;

public class InfiniteStreamApp {
    public static void main(String[] args) {
        var stream = Stream.generate(() -> "Arif");
//        stream.forEach(System.out::println);
        var iterate = Stream.iterate(1, value -> value + 1);
    }
}
