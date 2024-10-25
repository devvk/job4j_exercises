package ru.job4j.stream;

import java.util.List;

public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        return data.stream()
                .filter(i -> i % 2 == 0)
                .toList();
    }
}
