package ru.job4j.loop;

import java.util.StringJoiner;

public class Task111 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        int sum = 0;
        for (int i = num + 1; sum + i < Math.pow(num, 2); i++) {
            sum += i;
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }
}
