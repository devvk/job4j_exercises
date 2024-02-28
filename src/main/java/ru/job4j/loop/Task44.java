package ru.job4j.loop;

import java.util.StringJoiner;

public class Task44 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 100; i < 1000; i++) {
            int digit1 = i / 100;
            int digit2 = i % 100 / 10;
            int digit3 = i % 10;
            int reverseDigits = digit3 * 100 + digit2 * 10 + digit1;
            if (Math.sqrt(i * reverseDigits) % 1 == 0 && i != reverseDigits && digit3 != 0) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
