package ru.job4j.loop;

public class Task107 {
    public static void loop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 999) {
                System.out.println("Значений: " + i);
                break;
            }
            System.out.println(nums[i]);
        }
    }
}
