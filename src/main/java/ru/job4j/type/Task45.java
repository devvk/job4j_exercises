package ru.job4j.type;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        int number1FirstDigit = number1 / 100;
        int number2FirstDigit = number2 / 100;

        int number1LastDigits = number1 % 100;
        int number2LastDigits = number2 % 100;

        System.out.println(number2FirstDigit * 100 + number1LastDigits);
        System.out.println(number1FirstDigit * 100 + number2LastDigits);
    }

}
