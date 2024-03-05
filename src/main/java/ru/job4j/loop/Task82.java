package ru.job4j.loop;

public class Task82 {
    public static void loop(int[] promo, int[] concert) {
        int sum = 0;
        int free = 0;
        for (int i = 0; i < promo.length; i++) {
            sum += promo[i] + concert[i];
            if (promo[i] >= 10) {
                free += promo[i] / 10;
            }
        }
        System.out.printf("Продано билетов: %d, выдано бесплатно: %d%n", sum, free);
    }
}
