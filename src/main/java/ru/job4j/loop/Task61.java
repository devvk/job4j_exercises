package ru.job4j.loop;

import java.util.StringJoiner;

public class Task61 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i < 500; i++) {
            if (Math.pow(i / 100, 2) + Math.pow(i % 10, 2) == Math.pow(i % 100 / 10, 2)) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
