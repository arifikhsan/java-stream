package org.example;

import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class GroupByApp {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var collect = numbers
                .stream()
                .collect(Collectors.groupingBy(number -> (number > 5) ? "Besar" : "Kecil"));
        System.out.println(collect);

        var names = List.of("Arif", "Ikhsan", "Udin");
        var groupName = names
                .stream()
                .collect(Collectors.groupingBy(name -> (name.length() > 4) ? "Panjang" : "Pendek"));
        System.out.println(groupName);

        var partitionNumber = numbers.stream().collect(Collectors.partitioningBy(number -> number > 4));
        System.out.println(partitionNumber);

        var partitionName = names.stream().collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println(partitionNumber);
    }
}
