package ru.job4j.loop;

import java.util.StringJoiner;

public class Task141 {
    public static void loop(int x, int y) {
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int counter = 0;
        StringJoiner sj = new StringJoiner(" ");
        while (max > min) {
            if (max % 2 == 0) {
                max /= 2;
            } else {
                max -= 1;
            }
            if (min == max) {
                break;
            }
            sj.add(String.valueOf(max));
            counter++;
        }
        System.out.printf("Числа: %s, Количество: %d%n", sj.length() > 0 ? sj : 0, counter);
    }
}
