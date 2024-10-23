package ru.job4j.stream;

import java.util.List;

public class StringMap {
    public static List<String> map(List<String> names) {
        return names.stream()
                .map(s -> s + ".java")
                .toList();
    }
}
