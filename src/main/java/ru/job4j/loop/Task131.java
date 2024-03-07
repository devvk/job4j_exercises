package ru.job4j.loop;

import java.util.StringJoiner;

public class Task131 {
    public static void loop(int[] nums) {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int number : nums) {
            if (number % 2 == 0) {
                count++;
            }
            if (count == 3) {
                break;
            }
            sj.add(String.valueOf(number));
        }
        System.out.println(sj);
    }
}
