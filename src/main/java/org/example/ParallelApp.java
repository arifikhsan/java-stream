package org.example;

import java.util.List;

@SuppressWarnings("ALL")
public class ParallelApp {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().forEach(number -> {
            System.out.println(Thread.currentThread().getName() + ": " + number);
        });

        numbers.stream().parallel().forEach(number -> {
            System.out.println(Thread.currentThread().getName() + ": " + number);
        });
    }
}
