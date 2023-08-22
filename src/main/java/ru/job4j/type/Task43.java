package ru.job4j.type;

public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int number1FirstTwoDigits = number1 / 10;
        int number2FirstTwoDigits = number2 / 10;

        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;

        System.out.printf("%d%d\r\n", number1FirstTwoDigits, number2LastDigit);
        System.out.printf("%d%d\r\n", number2FirstTwoDigits, number1LastDigit);
    }
}
