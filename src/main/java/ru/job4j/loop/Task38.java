package ru.job4j.loop;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 200; i <= 223; i++) {
            int digit2 = i / 10 % 10;
            int digit3 = i % 10;
            if (digit2 % 2 == 0 && digit3 % 2 == 0) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
