package org.example;

import java.util.List;

public class LazyEvaluationApp {
    public static void main(String[] args) {
        var names = List.of("Arif", "Ikhsan", "Udin");
        names.stream().map(name -> {
                    // lazy evaluation
                    // tidak akan dijalankan dulu
                    System.out.println("Change " + name + " to uppercase");
                    return name.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Change " + upper + " to Mr.");
                    return "Mr. " + upper;
                })
                .forEach(upper -> {
                    // terminal operation
                    System.out.println("Terminal operation");
                    System.out.println(upper);
                });
    }
}
