package ru.job4j.loop;

import java.util.StringJoiner;

public class Task88 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int sum = i / 10 * i % 10;
            if (i == sum * 3) {
                sj.add(String.valueOf(i));
                count++;
            }
        }
        System.out.printf("Числа: %s, Количество: %d%n", sj, count);
    }
}
