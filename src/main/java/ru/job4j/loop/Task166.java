package ru.job4j.loop;

import java.util.StringJoiner;

public class Task166 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            if (i % 10 == 0 && getSumOddDivisors(i) % 10 == 0) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }

    private static int getSumOddDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
