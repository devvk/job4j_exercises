package ru.job4j.loop;

public class Task96 {
    public static void loop(int[] num) {
        int min = num[0];
        for (int i : num) {
            min = Math.min(min, i);
        }
        System.out.println(min);
    }
}
