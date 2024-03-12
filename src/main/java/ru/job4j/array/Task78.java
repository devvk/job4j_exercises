package ru.job4j.array;

import java.util.StringJoiner;

public class Task78 {
    public static void array(int[] array) {
        StringJoiner sj = new StringJoiner(" ");
        for (int a1 : array) {
            int count = 0;
            for (int a2 : array) {
                if (a1 == a2) {
                    count++;
                }
            }
            if (count == 1) {
                sj.add(String.valueOf(a1));
            }
        }
        System.out.println(sj);
    }
}
