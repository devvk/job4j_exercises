package ru.job4j.loop;

import java.util.StringJoiner;

public class Task121 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        for (int number : nums) {
            sj.add(String.valueOf(getSum(number)));
        }
        System.out.println(sj);
    }

    private static int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }
}
