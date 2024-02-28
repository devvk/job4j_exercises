package ru.job4j.loop;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = num - 6; i >= num - 30; i -= 6) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }
}
