package ru.job4j.array;

import java.util.Arrays;

public class Task14 {
    public static int[] diff(int[] left, int[] right) {
        int size = 0;
        int[] result = new int[left.length];
        for (int l : left) {
            int count = 0;
            for (int r : right) {
                if (l == r) {
                    break;
                }
                count++;
                if (count == right.length) {
                    result[size++] = l;
                }
            }
        }
        return right.length == 0 ? left : Arrays.copyOf(result, size);
    }
}
