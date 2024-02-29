package ru.job4j.loop;

import java.util.StringJoiner;

public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = Math.max(n, m); i < n + m; i++) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }
}
