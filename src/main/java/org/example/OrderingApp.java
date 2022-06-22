package org.example;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.reverseOrder;

public class OrderingApp {
    public static void main(String[] args) {
        var names = List.of("e", "a", "c", "k", "z");

        names.stream().sorted().forEach(System.out::println);
        names.stream().sorted(reverseOrder()).forEach(System.out::println);
    }
}
