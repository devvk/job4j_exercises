package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int size = 0;
        int[] result = new int[left.length + right.length];
        for (int l : left) {
            for (int r : right) {
                if (l == r) {
                    result[size++] = l;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, size);
    }
}
