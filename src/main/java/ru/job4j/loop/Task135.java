package ru.job4j.loop;

public class Task135 {
    public static void loop(int num) {
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        System.out.println(reverse);
    }
}

