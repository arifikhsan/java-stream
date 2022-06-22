package org.example;

import java.util.Comparator;
import java.util.List;

@SuppressWarnings("ALL")
public class AggregateApp {
    public static void main(String[] args) {
        var names = List.of("e", "a", "c", "k", "z");
        names.stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

        names.stream()
                .max(Comparator.reverseOrder())
                .ifPresent(System.out::println);

        names.stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);

        var count = names.stream()
                .count();
        System.out.println(count);

        var numbers = List.of(1, 2, 3, 4, 5);

        var resultAdding = numbers.stream().reduce(0, (result, value) -> result + value);
        System.out.println(resultAdding);

        var resultFactorial = numbers.stream().reduce(1, (result, value) -> result * value);
        System.out.println(resultFactorial);
    }
}
