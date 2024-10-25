package ru.job4j.stream;

import java.util.List;

public class SkipMethod {
    public static List<String> lastThree(List<String> strings) {
        return strings.stream()
                .skip(2)
                .toList();
    }
}
