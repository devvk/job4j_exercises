package ru.job4j.loop;

public class Task140 {
    public static void loop(int num) {
        for (int i = num; i >= 1; i--) {
            if (num % i == 0 && i != num) {
                System.out.println(i);
                break;
            }
        }
    }
}
