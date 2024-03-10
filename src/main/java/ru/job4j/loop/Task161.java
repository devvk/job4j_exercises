package ru.job4j.loop;

import java.util.StringJoiner;

public class Task161 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
