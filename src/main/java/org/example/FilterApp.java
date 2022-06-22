package org.example;

import java.util.List;

@SuppressWarnings("ALL")
public class FilterApp {
    public static void main(String[] args) {
        var names = List.of("Eko", "Kurniawan", "Khannedy", "Budi", "Joko");
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        var names2 = List.of("Eko", "Eko", "Kurniawan", "Khannedy", "Budi", "Joko");
        names2.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
