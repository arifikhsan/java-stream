package org.example;

import java.util.List;

public class MatchApp {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5);

        var isAnyGreaterThan20 = numbers.stream()
                .anyMatch(number -> number > 20);

        System.out.println(isAnyGreaterThan20);

        var isAllLessThan = numbers.stream().allMatch(number -> number > 0);
        System.out.println(isAllLessThan);

        var isNotElementGreaterThan20 = numbers.stream().noneMatch(number -> number > 20);
        System.out.println(isNotElementGreaterThan20);
    }
}
