package ru.job4j.loop;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        for (int number : nums) {
            if (getSum(number) == 5) {
                break;
            }
            sj.add(String.valueOf(number));
        }
        System.out.println(sj);

    }

    private static int getSum(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }
}
