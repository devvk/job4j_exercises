package ru.job4j.loop;

public class Task119 {
    public static void loop(int num, int digit) {
        boolean isContains = false;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == digit) {
                isContains = true;
                break;
            }
            num /= 10;
        }
        System.out.println(isContains ? "Да" : "Нет");
    }
}
