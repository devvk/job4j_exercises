package ru.job4j.stream;

import java.util.List;

public class NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream()
                .map(i -> i * i)
                .toList();
    }
}
