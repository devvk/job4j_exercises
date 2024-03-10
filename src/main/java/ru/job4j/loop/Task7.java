package ru.job4j.loop;

public class Task7 {
    public static int calculate(int a, int n) {
        int pow = a;
        for (int i = 1; i < n; i++) {
            pow *= a;
        }
        return pow;
    }
}
