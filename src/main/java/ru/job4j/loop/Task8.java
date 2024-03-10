package ru.job4j.loop;

public class Task8 {
    public static void loop(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
