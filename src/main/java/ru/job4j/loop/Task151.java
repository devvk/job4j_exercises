package ru.job4j.loop;

import java.util.StringJoiner;

public class Task151 {
    public static void loop() {
        for (int i = 1; i < 10; i++) {
            StringJoiner sj = new StringJoiner(" ");
            for (int j = 1; j < 10; j++) {
                sj.add(String.valueOf(i * j));
            }
            System.out.println(sj);
        }
    }
}
