package ru.job4j.loop;

import java.util.StringJoiner;

public class Task165 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrimeNumber(i)) {
                sj.add(Integer.toString(i));
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
