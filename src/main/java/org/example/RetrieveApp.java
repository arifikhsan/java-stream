package org.example;

import java.util.List;

public class RetrieveApp {
    public static void main(String[] args) {
        var names = List.of("Arif", "Ikhsan", "Udin");
        names.stream()
                .limit(2)
                .forEach(System.out::println);

        names.stream()
                .skip(2)
                .forEach(System.out::println);

        System.out.println("take while");

        // berhenti ketika menemukan false. beda dengan filter yang mengecek semua
        names.stream()
                .takeWhile(name -> name.length() < 5)
                .forEach(System.out::println);

        System.out.println("drop while");
        names.stream()
                .dropWhile(name -> name.length() < 5)
                .forEach(System.out::println);

        System.out.println("find any");
        names.stream().findAny().ifPresent(System.out::println);

        System.out.println("find first");
        names.stream().findFirst().ifPresent(System.out::println);
    }
}
