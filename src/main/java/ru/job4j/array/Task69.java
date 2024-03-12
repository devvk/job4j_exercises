package ru.job4j.array;

import java.util.StringJoiner;

public class Task69 {
    public static void array(int[] array) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < array.length; i++) {
            sj.add(String.valueOf(array[array.length - 1 - i]));
        }
        System.out.println(sj);
    }
}
