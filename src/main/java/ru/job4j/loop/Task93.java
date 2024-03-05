package ru.job4j.loop;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            int points = first[i] + second[i];
            if (points >= 80) {
                sum += points;
                count++;
            }
        }
        System.out.printf("В финале: %d, сумма баллов: %d%n", count, sum);
    }
}
