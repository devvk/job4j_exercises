package ru.job4j.loop;

public class Task153 {
    private static final int COST_BULL = 10;
    private static final int COST_COW = 5;
    private static final int MONEY = 100;

    public static void loop() {
        for (int i = 0; i <= MONEY / COST_BULL; i++) {
            int cows = (MONEY - COST_BULL * i) / COST_COW;
            System.out.printf("Быков: %d, коров: %d%n", i, cows);
        }
    }
}
