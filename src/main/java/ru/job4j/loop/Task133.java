package ru.job4j.loop;

import java.util.StringJoiner;

public class Task133 {
    public static void loop(int num) {
        int result;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            result = (int) Math.pow(num, i);
            if (result < 1000) {
                sj.add(String.valueOf(result));
            } else {
                break;
            }
        }
        System.out.printf(sj.length() > 0 ? sj + "%n" : "");
    }
}
