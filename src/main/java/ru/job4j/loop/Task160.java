package ru.job4j.loop;

public class Task160 {
    public static void loop(int num) {
        int numDivisorsSum = getDivisorsSum(num);
        for (int i = num; i < Integer.MAX_VALUE; i++) {
            if (i == numDivisorsSum) {
                System.out.println(i);
                break;
            }
        }
    }

    private static int getDivisorsSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
