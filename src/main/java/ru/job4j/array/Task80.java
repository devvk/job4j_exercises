package ru.job4j.array;

import java.util.Arrays;

public class Task80 {
    public static int[] array(int[] nums) {
        int id = 0;
        int[] ids = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int countDouble = 0;
            for (int a2 : nums) {
                if (nums[i] == a2) {
                    countDouble++;
                }
            }
            if (countDouble == 1) {
                ids[id++] = i;
            }
        }
        return Arrays.copyOf(ids, id);
    }
}
