package ru.job4j.loop;

import java.util.StringJoiner;

public class Task89 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if (getArmstrong(i) == i) {
                sj.add(String.valueOf(i));
                count++;
            }
        }
        System.out.printf("Числа: %s, Количество: %d%n", sj, count);
    }

    private static int getArmstrong(int number) {
        int d1 = number / 100;
        int d2 = number % 100 / 10;
        int d3 = number % 10;
        return d1 * d1 * d1 + d2 * d2 * d2 + d3 * d3 * d3;
    }
}
