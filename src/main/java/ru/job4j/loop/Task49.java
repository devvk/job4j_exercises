package ru.job4j.loop;

import java.util.StringJoiner;

public class Task49 {
    public static void loop(int n, int m) {
        StringJoiner sj = new StringJoiner("+");
        for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
            if (i % 2 == 0) {
                sj.add(String.valueOf(i));
            }
        }
        System.out.println(sj);
    }
}
