package ru.job4j.loop;

import java.util.StringJoiner;

public class Task152 {
    public static void loop() {
        for (int i = 1; i < 4; i++) {
            StringJoiner sj = new StringJoiner(" ");
            for (int j = 10; j <= 20; j++) {
                if (i == 1 && j % 2 == 0) {
                    sj.add(String.valueOf(j));
                } else if (i == 2 && j % 3 == 0) {
                    sj.add(String.valueOf(j));
                } else if (i == 3 && j % 4 == 0) {
                    sj.add(String.valueOf(j));
                }
            }
            System.out.println(sj);
        }
    }
}
