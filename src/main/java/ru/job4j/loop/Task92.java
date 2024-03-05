package ru.job4j.loop;

import java.util.StringJoiner;

public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        if (n1 + 1 < n2) {
            StringJoiner sj = new StringJoiner(" ");
            int step = a2 / n2;
            while (n1 + 1 < n2) {
                sj.add(String.valueOf(a1 += step));
                n1++;
            }
            System.out.println(sj);
        } else {
            System.out.println("Нет чисел");
        }
    }
}
