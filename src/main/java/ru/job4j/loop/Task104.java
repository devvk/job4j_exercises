package ru.job4j.loop;

public class Task104 {
    public static void loop(int[] num) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
