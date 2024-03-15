package ru.job4j.array;

import java.util.StringJoiner;

public class Task76 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(", ");
        int[] frequency = new int[5];
        for (int number : nums) {
            frequency[number - 1]++;
        }
        for (int i = frequency.length - 1; i >= 0; i--) {
            sj.add(String.format("%d: %d", i + 1, frequency[i]));
        }
        System.out.println(sj);
    }
}
