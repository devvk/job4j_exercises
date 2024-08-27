package ru.job4j.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        int first = list.indexOf(str);
        return first != -1 && first == list.lastIndexOf(str);
    }
}
