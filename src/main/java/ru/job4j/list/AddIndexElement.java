package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException();
        }

        List<String> check = new ArrayList<>(list);
        if (!list.contains(str)) {
            list.add(index, str);
        }
        return list.size() > check.size();
    }
}
