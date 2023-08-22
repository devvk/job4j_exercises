package ru.job4j.condition;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;

        if (num1LastDigit > num2LastDigit) {
            System.out.println(num1LastDigit);
        } else if (num2LastDigit > num1LastDigit) {
            System.out.println(num2LastDigit);
        } else {
            System.out.println("Одинаковые");
        }
    }
}
