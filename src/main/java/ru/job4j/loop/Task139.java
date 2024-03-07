package ru.job4j.loop;

public class Task139 {
    public static void loop(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
