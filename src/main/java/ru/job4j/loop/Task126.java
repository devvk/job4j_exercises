package ru.job4j.loop;

import java.util.StringJoiner;

public class Task126 {
    public static void loop(int num) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner odd = new StringJoiner(" ");
        String digits = String.valueOf(num);
        for (int i = 0; i < digits.length(); i++) {
            char number = digits.charAt(i);
            if ((i + 1) % 2 == 0) {
                even.add(String.valueOf(number));
            } else {
                odd.add((String.valueOf(number)));
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
