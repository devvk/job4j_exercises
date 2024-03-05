package ru.job4j.loop;

import java.util.StringJoiner;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        int step = n2 - n1;
        if (n3 - n2 == step) {
            StringJoiner sj = new StringJoiner(" ");
            for (int i = 0; i < 3; i++) {
                sj.add(String.valueOf(n3 += step));
            }
            System.out.println(sj);
        } else {
            System.out.println("Нет");
        }
    }
}
