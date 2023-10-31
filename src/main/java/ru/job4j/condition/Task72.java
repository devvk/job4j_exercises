package ru.job4j.condition;

public class Task72 {
    public static void midDigitMore(int num) {
        int digit1 = num / 100;
        int digit2 = num % 100 / 10;
        int digit3 = num % 10;

        if (digit2 > digit1 && digit2 > digit3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
