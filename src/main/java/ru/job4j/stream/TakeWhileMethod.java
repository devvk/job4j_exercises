package ru.job4j.stream;

import java.util.List;

public class TakeWhileMethod {
    public static List<Integer> takeWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .takeWhile(i -> i < 0)
                .toList();
    }
}
