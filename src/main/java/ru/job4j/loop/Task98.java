package ru.job4j.loop;

public class Task98 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        for (int j : num) {
            min = Math.min(min, j);
            max = Math.max(max, j);
        }
        System.out.println((min + max) / 2);
    }
}
