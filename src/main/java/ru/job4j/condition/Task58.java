package ru.job4j.condition;

public class Task58 {
    public static void isWinning(int number) {
        int digit1 = number / 100_000;
        int digit2 = number % 100_000 / 10_000;
        int digit3 = number % 10_000 / 1_000;
        int digit4 = number % 1_000 / 100;
        int digit5 = number % 100 / 10;
        int digit6 = number % 10;

        int sumFirstDigits = digit1 + digit2 + digit3;
        int sumLastDigits = digit4 + digit5 + digit6;

        if (sumFirstDigits == sumLastDigits && sumFirstDigits % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
