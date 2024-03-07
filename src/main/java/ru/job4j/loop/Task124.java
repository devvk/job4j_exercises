package ru.job4j.loop;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        int max = 0;
        int index = Integer.MIN_VALUE;
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            int sum = getSum(nums[i]);
            if (sum > max) {
                max = sum;
                index = i;
            }
            sj.add(String.valueOf(sum));
        }
        System.out.printf("Суммы: %s, индекс: %d%n", sj, index);
    }

    private static int getSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
