package ru.job4j.loop;

import java.util.StringJoiner;

public class Task90 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int sum = 0;
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int d1 = i / 10;
            int d2 = i % 10;
            if ((d1 + d2) * 2 == d1 * d2) {
                sj.add(String.valueOf(i));
                sum += i;
                count++;
            }
        }
        System.out.printf("Числа: %s, Количество: %d, Сумма: %d%n", sj, count, sum);
    }
}
