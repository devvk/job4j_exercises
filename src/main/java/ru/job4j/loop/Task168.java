package ru.job4j.loop;

public class Task168 {
    public static void loop(int num1, int num2, int num3) {
        int[] numbers = {num1, num2, num3};
        int sumAllDigits = 0;
        for (int number : numbers) {
            int sumDigits = getSumDigits(number);
            sumAllDigits += sumDigits;
            System.out.printf("Цифр: %d, сумма цифр: %s, делителей: %d%n",
                    getDigits(number), sumDigits, getCountDivisors(number));
        }
        System.out.printf("Сумма всех цифр: %d%n", sumAllDigits);
    }

    private static int getDigits(int number) {
        return String.valueOf(number).length();
    }

    private static int getSumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    private static int getCountDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
