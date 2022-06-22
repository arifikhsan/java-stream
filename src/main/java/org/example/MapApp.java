package org.example;

import java.util.List;

public class MapApp {
    public static void main(String[] args) {
        var names = List.of("Arif", "Ikhsan", "Udin");
        var streamUpper = names.stream().map(String::toUpperCase);
        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
