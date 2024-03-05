package ru.job4j.loop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = money;
        for (int i = 0; i < months; i++) {
            sum += sum * percent / 100;
        }
        System.out.println(BigDecimal.valueOf(sum).setScale(2, RoundingMode.HALF_UP));
    }
}
