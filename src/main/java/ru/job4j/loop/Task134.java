package ru.job4j.loop;

public class Task134 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (sum + (int) Math.pow(i, 2) > num) {
                break;
            }
            sum += (int) Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
