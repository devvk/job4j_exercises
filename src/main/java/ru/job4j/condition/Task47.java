package ru.job4j.condition;

public class Task47 {
    public static void changeNum(int number) {
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;

        int newNumber;

        if (number > 500) {
            newNumber = ones * 100 + tens * 10 + hundreds;
        } else {
            newNumber = hundreds * 100 + ones * 10 + tens;
        }
        System.out.println(newNumber);
    }
}
