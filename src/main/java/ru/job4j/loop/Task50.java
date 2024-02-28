package ru.job4j.loop;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1; i <= n * 5; i += n) {
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }
}
