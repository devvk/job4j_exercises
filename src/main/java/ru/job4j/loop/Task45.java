package ru.job4j.loop;

import java.util.StringJoiner;

public class Task45 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i < 500; i++) {
            if (i % 100 == num) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
