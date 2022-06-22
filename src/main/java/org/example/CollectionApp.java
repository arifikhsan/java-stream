package org.example;

import java.util.List;
import java.util.stream.Stream;

public class CollectionApp {
    public static void main(String[] args) {
        var names = List.of("Arif", "ikhsan", "udin");
        Stream<String> stringStream = names.stream();
        stringStream.forEach(System.out::println);
    }
}
