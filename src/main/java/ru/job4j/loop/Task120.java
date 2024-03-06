package ru.job4j.loop;

import java.util.StringJoiner;

public class Task120 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        while (num > 0) {
            num /= 10;
            sj.add(String.valueOf(num));
        }
        System.out.println(sj);
    }
}
