package ru.job4j.array;

import java.util.StringJoiner;

public class Task74 {
    public static void array(int[] nums) {
        StringJoiner first = new StringJoiner(" ");
        StringJoiner second = new StringJoiner(" ");
        for (int i = 0; i < nums.length / 2; i++) {
            first.add(String.valueOf(nums[i]));
            second.add(String.valueOf(nums[nums.length - 1 - i]));
        }
        if (nums.length % 2 != 0) {
            second.add(String.valueOf(nums[nums.length / 2]));
        }
        System.out.println(first);
        System.out.println(second);
    }
}
