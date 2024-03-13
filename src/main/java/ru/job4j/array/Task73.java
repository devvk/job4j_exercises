package ru.job4j.array;

import java.util.StringJoiner;

public class Task73 {
    public static void array(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            StringJoiner first = new StringJoiner(" ");
            first.add(String.valueOf(nums[i]));
            first.add(String.valueOf(nums[nums.length - i - 1]));
            System.out.println(first);
        }
        if (nums.length % 2 != 0) {
            System.out.println(nums[nums.length / 2]);
        }
    }
}
