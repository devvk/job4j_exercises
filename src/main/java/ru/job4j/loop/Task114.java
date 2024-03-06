package ru.job4j.loop;

public class Task114 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i];
            if (nums[i] == nums[i + 1]) {
                break;
            }
        }
        System.out.println(sum);
    }
}
