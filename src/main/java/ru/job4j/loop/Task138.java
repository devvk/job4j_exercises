package ru.job4j.loop;

public class Task138 {
    public static void loop() {
        for (int i = 99; i >= 10; i--) {
            if (i % (i / 10 + i % 10) == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
