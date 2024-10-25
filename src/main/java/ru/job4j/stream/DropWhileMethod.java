package ru.job4j.stream;

import java.util.List;

public class DropWhileMethod {
    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .dropWhile(i -> i < 0)
                .toList();
    }
}
