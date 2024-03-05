package ru.job4j.loop;

public class Task99 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        int sum = 0;
        for (int i : num) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            sum += i;
        }
        System.out.println(min + max / 2 > sum / num.length ? "Больше" : "Нет");
    }
}
