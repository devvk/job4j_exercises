package ru.job4j.loop;

import java.util.StringJoiner;

public class Task157 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ").add(String.valueOf(1));
        for (int i = 1; i < 10_000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                sj.add(String.valueOf(sum));
            }
        }
        System.out.println(sj);
    }
}
