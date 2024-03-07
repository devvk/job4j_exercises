package ru.job4j.loop;

public class Task137 {
    public static void loop(int num) {
        for (int i = 10; i < 100; i++) {
            if (i % 10 + i / 10 == num) {
                System.out.println(i);
                break;
            }
        }
    }
}
