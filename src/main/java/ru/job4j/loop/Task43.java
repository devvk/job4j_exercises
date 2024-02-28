package ru.job4j.loop;

import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 300; i <= 325; i++) {
            int digit1 = i / 100;
            int digits23 = i % 100;
            if (digits23 >= 10 && digits23 % digit1 == 0) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
