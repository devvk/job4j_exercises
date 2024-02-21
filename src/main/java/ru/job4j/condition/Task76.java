package ru.job4j.condition;

public class Task76 {
    public static void sameNumAmount(int num) {
        int digit1 = num / 100;
        int digit2 = num % 100 / 10;
        int digit3 = num % 10;
        int count = 0;

        if (digit1 == digit2) {
            count++;
        }
        if (digit1 == digit3) {
            count++;
        }
        if (digit2 == digit3) {
            count++;

        }

        System.out.println(count > 0 && count != 3 ? ++count : count);
    }
}
