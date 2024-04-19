package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int size = 0;
        int[] result = new int[left.length + right.length];
        if (left.length == 0) {
            return right;
        }
        if (right.length == 0) {
            return left;
        }
        for (int l : left) {
            int count = 0;
            for (int r : right) {
                count++;
                if (l == r) {
                    result[size++] = l;
                    break;
                } else if (count == left.length) {
                    result[size++] = r;
                    break;
                } else if (count == right.length) {
                    result[size++] = l;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, size);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(OrArray.or(new int[]{1, 2}, new int[]{1, 2, 3})));
    }
}
