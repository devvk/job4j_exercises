package ru.job4j.loop;

public class Task105 {
    public static void loop(int[] num) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < num.length; i++) {
            int sum = getSum(num[i]);
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(index);
    }

    private static int getSum(int number) {
        return number / 100 + number % 100 / 10 + number % 10;
    }
}
