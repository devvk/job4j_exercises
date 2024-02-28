package ru.job4j.loop;

import java.util.StringJoiner;

public class Task40 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 20; i <= 40; i++) {
            if (i / 10 % 3 == 0 && i % 10 % 3 == 0) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
