package ru.job4j.loop;

import java.util.StringJoiner;

public class Task132 {
    public static void loop(int[] nums) {
        int count = 0;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && (i + 1) % 2 != 0) {
                count++;
            }
            if (count == 3) {
                break;
            }
            sj.add(String.valueOf(nums[i]));
        }
        System.out.println(sj);
    }
}
