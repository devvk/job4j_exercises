package ru.job4j.loop;

public class Task118 {
    public static void loop(int num) {
        int countEven = 0;
        int sumOdd = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                countEven++;
            } else {
                sumOdd += lastDigit;
            }
            num /= 10;
        }
        System.out.printf("Количество чет: %d, сумма нечет: %d%n", countEven, sumOdd);
    }
}
