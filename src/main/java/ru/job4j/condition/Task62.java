package ru.job4j.condition;

public class Task62 {
    public static void isRising(int number) {
        int digit1 = number / 100;
        int digit2 = number % 100 / 10;
        int digit3 = number % 10;

        if (digit1 < digit2 && digit2 < digit3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
