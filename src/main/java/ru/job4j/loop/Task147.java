package ru.job4j.loop;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int buyers = 0;
        for (int ticket : tickets) {
            if (num - ticket >= 0) {
                num -= ticket;
                buyers++;
            }
        }
        System.out.printf("Покупатели: %d, отказано: %d%n", buyers, tickets.length - buyers);
    }
}
