package ru.job4j.stream;

import java.util.List;

public class Task1 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(i -> i % 4 != 0)
                .toList();
    }
}
