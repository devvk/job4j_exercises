package ru.job4j.array;

import java.util.StringJoiner;

public class Task71 {
    public static void array(int[] nums) {
        StringJoiner even = new StringJoiner(" ");
        StringJoiner odd = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(String.valueOf(nums[i]));
            } else {
                odd.add(String.valueOf(nums[i]));
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
