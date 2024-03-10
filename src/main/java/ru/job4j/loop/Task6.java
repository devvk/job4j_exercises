package ru.job4j.loop;

public class Task6 {
    public static int loop(int a, int b) {
        int sum = 1;
        for (int i = a; i <= b; i++) {
            sum *= i;
        }
        return sum;
    }
}
