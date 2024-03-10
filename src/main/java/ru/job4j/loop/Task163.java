package ru.job4j.loop;

import java.util.StringJoiner;

public class Task163 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if (getDivisorsSum(i) % 2 == 0) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }

    private static int getDivisorsSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
