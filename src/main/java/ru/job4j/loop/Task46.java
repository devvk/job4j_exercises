package ru.job4j.loop;

import java.util.StringJoiner;

public class Task46 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1000; i < 1500; i++) {
            if (i % 1000 / 10 == num) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
