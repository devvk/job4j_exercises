package ru.job4j.loop;

public class Task55 {
    public static void loop(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Четных: " + count + ", нечетных: " + (array.length - count));
    }
}
