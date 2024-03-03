package ru.job4j.loop;

public class Task68 {
    public static void loop(int num1, int num2) {
        int num1Dividers = 0;
        int num2Dividers = 0;
        for (int i = 1; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0) {
                num1Dividers++;
            }
            if (num2 % i == 0) {
                num2Dividers++;
            }
        }
        System.out.println(num1Dividers == num2Dividers ? "Да" : "Нет");
    }
}
