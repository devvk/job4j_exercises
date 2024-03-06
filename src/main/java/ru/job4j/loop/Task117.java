package ru.job4j.loop;

public class Task117 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                count++;
                sum += lastDigit;
            }
            num /= 10;

        }
        System.out.printf("Количество: %d, сумма: %d%n", count, sum);
    }
}
