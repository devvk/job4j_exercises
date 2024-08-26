package ru.job4j.list;

import java.util.List;

public class CheckerAndGetter {
    public static String getElement(List<String> list) {
        String result = "";
        if (!list.isEmpty()) {
            result = list.getFirst();
        }
        return result;
    }
}
