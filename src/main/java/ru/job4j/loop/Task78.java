package ru.job4j.loop;

public class Task78 {
    public static void loop(int[] days, int[] values) {
        int dangerDays = 0;
        int tuesdays = 0;
        for (int i = 0; i < days.length; i++) {
            if (values[i] >= 7) {
                dangerDays++;
            }
            if (days[i] == 2 && values[i] <= 5) {
                tuesdays++;
            }
        }
        System.out.printf("Опасно: %d, спокойный вторник: %d%n", dangerDays, tuesdays);
    }
}
