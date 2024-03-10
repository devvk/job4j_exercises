package ru.job4j.loop;

public class Task159 {
    public static final int LIMIT = 10_000;

    public static void loop() {
        int num = 0;
        int max = 0;
        for (int i = 1; i < LIMIT; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > max) {
                max = sum;
                num = i;
            }
        }
        System.out.println(num);
    }
}
