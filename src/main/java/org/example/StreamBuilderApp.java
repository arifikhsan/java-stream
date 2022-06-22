package org.example;

import java.util.stream.Stream;

public class StreamBuilderApp {
    public static void main(String[] args) {
        var builder = Stream.builder();
        builder.accept("Arif");
        builder.add("Ikhsan").add("Udin");

        var stream = builder.build();
        stream.forEach(System.out::println);

        var stream2 = Stream.builder().add("a").add("b").add("c").build();
        stream2.forEach(System.out::println);
    }
}
