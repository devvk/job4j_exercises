package ru.job4j.array;

import java.util.StringJoiner;

public class Task70 {
    public static void array(int[] nums) {
        StringJoiner first = new StringJoiner(" ");
        StringJoiner second = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            int limit = nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2 + 1;
            if (i < limit) {
                first.add(String.valueOf(nums[i]));
            } else {
                second.add(String.valueOf(nums[i]));
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}
