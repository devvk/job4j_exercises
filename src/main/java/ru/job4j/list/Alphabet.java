package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        String[] letters = s.split("");
        List<String> list = new ArrayList<>(Arrays.asList(letters));
        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }
}
