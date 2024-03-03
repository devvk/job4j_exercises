package ru.job4j.loop;

import java.util.StringJoiner;

public class Task66 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner dividers = new StringJoiner(" ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                dividers.add(String.valueOf(i));
            }
        }
        if (dividers.length() == 0) {
            dividers.add(String.valueOf(0));
        }
        System.out.println("Количество: " + count + ", Делители: " + dividers);
    }
}
