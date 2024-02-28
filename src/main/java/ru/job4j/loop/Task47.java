package ru.job4j.loop;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1345; i < 1445; i++) {
            int digit1 = i / 1000;
            int digit2 = i % 1000 / 100;
            int digit3 = i % 100 / 10;
            int digit4 = i % 10;
            if (digit1 + digit2 == 5 && digit3 + digit4 == 5) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
