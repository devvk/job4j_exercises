package ru.job4j.loop;

public class Task102 {
    public static void loop(int[] num) {
        int min = 0;
        int max = 0;
        for (int number : num) {
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        System.out.printf("Max: %s, min: %s%n", max > 0 ? max : "Нет", min < 0 ? min : "Нет");
    }
}
