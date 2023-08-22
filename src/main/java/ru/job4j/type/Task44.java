package ru.job4j.type;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int last1 = number1 % 10;
        int last2 = number2 % 10;
        int remainingDigits1 = number1 / 10;
        int remainingDigits2 = number2 / 10;
        System.out.println("" + remainingDigits1 + last2);
        System.out.println("" + remainingDigits2 + last1);
    }
}
