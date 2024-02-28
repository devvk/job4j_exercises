package ru.job4j.loop;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = num + 1; i < num + 11; i++) {
            if (i % 2 != 0) {
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(sj);
    }
}
