package ru.job4j.loop;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                break;
            }
            sum1 += first[i];
            sum2 += second[i];
        }
        System.out.printf("Сумма1: %d, сумма2: %d%n", sum1, sum2);
    }
}
