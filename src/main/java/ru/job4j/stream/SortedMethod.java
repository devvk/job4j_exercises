package ru.job4j.stream;

import java.util.List;

public class SortedMethod {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted()
                .toList();
    }
}
