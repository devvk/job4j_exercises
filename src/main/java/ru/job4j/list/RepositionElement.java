package ru.job4j.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The List is empty.");
        }
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        String element = list.removeLast();
        list.set(index, element);
        return list;
    }
}
