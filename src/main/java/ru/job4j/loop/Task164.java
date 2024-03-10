package ru.job4j.loop;

import java.util.StringJoiner;

public class Task164 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 10; i < 100; i++) {
            if (Math.pow(i, 2) <= 300) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}

