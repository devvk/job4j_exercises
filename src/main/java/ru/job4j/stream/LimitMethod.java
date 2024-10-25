package ru.job4j.stream;

import java.util.List;

public class LimitMethod {
    public static List<String> firstThree(List<String> strings) {
        return strings.stream()
                .limit(3)
                .toList();
    }
}
