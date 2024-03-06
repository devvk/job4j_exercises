package ru.job4j.loop;

public class Task103 {
    public static void loop(int[] num) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int number : num) {
            int sum = getSum(number);
            if (sum < min) {
                min = sum;
                result = number;
            }
        }
        System.out.println(result);
    }

    private static int getSum(int number) {
        return number / 100 + number % 100 / 10 + number % 10;
    }
}
