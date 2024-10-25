package ru.job4j.stream;

import java.util.List;

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.endsWith(".java"))
                .toList();
    }
}
