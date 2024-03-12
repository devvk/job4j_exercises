package ru.job4j.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] array) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i : array) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }
}
