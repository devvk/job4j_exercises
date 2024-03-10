package ru.job4j.loop;

import java.util.StringJoiner;

public class Task162 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i < 150; i++) {
            if (isPrimeNumber(i)) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
