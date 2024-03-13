package ru.job4j.array;

import java.util.Arrays;

public class Task80 {
    public static int[] array(int[] nums) {
        int id = 0;
        int[] ids = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int repeated = 0;
            for (int a2 : nums) {
                if (nums[i] == a2) {
                    repeated++;
                }
            }
            if (repeated == 1) {
                ids[id++] = i;
            }
        }
        return Arrays.copyOf(ids, id);
    }
}
