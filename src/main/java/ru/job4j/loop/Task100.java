package ru.job4j.loop;

public class Task100 {
    public static void loop(int[] num) {
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i : num) {
            int sum = i / 10 + i % 10;
            if (sum > max) {
                max = sum;
                result = i;
            }
        }
        System.out.println(result);
    }
}
