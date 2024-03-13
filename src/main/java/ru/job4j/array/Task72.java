package ru.job4j.array;

import java.util.StringJoiner;

public class Task72 {
    public static void array(int[] nums) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner odd = new StringJoiner(" ");
        for (int number : nums) {
            if (number % 2 == 0) {
                even.add(String.valueOf(number));
            } else {
                odd.add(String.valueOf(number));
            }
        }
        if (even.length() > 0) {
            System.out.println(even);
        }
        if (odd.length() > 0) {
            System.out.println(odd);
        }
    }
}
