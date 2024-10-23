package ru.job4j.stream;

import java.util.List;

public class CharsMethod {
    public static List<Character> symbols(String string) {
        return string.chars()
                .mapToObj(i -> (char) i)
                .toList();
    }
}
