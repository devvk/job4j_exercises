package ru.job4j.loop;

import java.util.StringJoiner;

public class Task53 {
    public static void loop(int n) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) {
            sj.add(String.valueOf((int) Math.pow(2, i)));
        }
        System.out.println(sj);
    }
}
