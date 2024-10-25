package ru.job4j.stream;

import java.util.Collection;
import java.util.List;

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(Collection::stream)
                .toList();
    }
}
