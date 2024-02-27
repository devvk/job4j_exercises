package ru.job4j.loop;

import java.util.StringJoiner;

public class Task32 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 50; i >= 10; i--) {
            if (i % 10 == 7) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
