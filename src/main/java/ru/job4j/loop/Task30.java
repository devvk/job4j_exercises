package ru.job4j.loop;

import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i <= 130; i++) {
            int lastDigit = i % 10;
            if (lastDigit == num % 10) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
