package org.example;

import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class CollectorsApp {
    public static void main(String[] args) {
        var names = List.of("e", "a", "c", "k", "z");

        var set = names.stream().collect(Collectors.toSet());
        var immutableSet = names.stream().collect(Collectors.toUnmodifiableSet());
        var list = names.stream().collect(Collectors.toList());
        var immutableList = names.stream().collect(Collectors.toUnmodifiableList());

        var map = names.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        System.out.println(map);
    }
}
