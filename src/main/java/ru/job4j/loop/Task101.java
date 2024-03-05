package ru.job4j.loop;

public class Task101 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        for (int i : num) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        System.out.printf("Max: %d, min: %d%n", max, min);
    }
}
