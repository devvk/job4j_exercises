package ru.job4j.array;

import java.util.StringJoiner;

public class Task27 {
    public static String convert(String[] words) {
        StringJoiner sj = new StringJoiner(" ");
        for (String word : words) {
            sj.add(word);
        }
        return sj.toString();
    }
}
