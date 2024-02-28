package ru.job4j.loop;

import java.util.StringJoiner;

public class Task37 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i < 130; i++) {
            int digit1 = i / 100;
            int digit2 = i / 10 % 10;
            int digit3 = i % 10;
            if (digit1 * digit3 == Math.pow(digit2, 2)) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
