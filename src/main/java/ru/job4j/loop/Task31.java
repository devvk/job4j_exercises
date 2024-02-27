package ru.job4j.loop;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (firstDigit * secondDigit < num) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
