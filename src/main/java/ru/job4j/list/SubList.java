package ru.job4j.list;

import java.util.Collections;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int first = list.indexOf(el);
        int last = list.lastIndexOf(el);
        if (first == -1 || last == first) {
            return Collections.emptyList();
        }
        return list.subList(first, last);
    }
}
