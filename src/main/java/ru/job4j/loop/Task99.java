package ru.job4j.loop;

public class Task99 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        int sum = 0;
        for (int j : num) {
            min = Math.min(min, j);
            max = Math.max(max, j);
            sum += j;
        }
        System.out.println(min + max / 2 > sum / num.length ? "Больше" : "Нет");
    }
}
