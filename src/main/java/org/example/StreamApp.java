package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
        Stream<String> name = Stream.of("Arif");
        Stream<String> empty = Stream.empty();
        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);

        Stream<String> streamString = Stream.of("Arif", "Ikhsan", "Udin");
        Stream<Integer> streamInteger = Stream.of(1, 2, 3, 4, 5);

        var array = new String[]{"Arif", "Ikhsan", "Udin"};
        Stream<String> streamArray = Arrays.stream(array);

        streamString.forEach(System.out::println);
        streamInteger.forEach(System.out::println);
    }
}
