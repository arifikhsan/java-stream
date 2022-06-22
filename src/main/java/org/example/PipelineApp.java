package org.example;

import java.util.List;

public class PipelineApp {
    public static void main(String[] args) {
        var names = List.of("Arif", "Ikhsan", "Udin");
        names.stream()
                .map(String::toUpperCase)
                .map(name -> "Mr. " + name)
                .forEach(System.out::println);
    }
}
