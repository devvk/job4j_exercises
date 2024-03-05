package ru.job4j.loop;

public class Task87 {
    public static void loop() {
        for (int i = 10; i < 70; i++) {
            int digitsSum = i / 10 + i % 10;
            if (Math.pow(digitsSum, 3) == Math.pow(i, 2)) {
                System.out.println(i);
            }
        }
    }

}
