package ru.job4j.loop;

import java.util.StringJoiner;

public class Task86 {
    public static void loop(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        for (int number : nums) {
            if (getSum(number) == getSum(number * 2)) {
                sj.add(String.valueOf(number));
            }
        }
        System.out.println(sj.length() != 0 ? sj : "Стабильных чисел нет");
    }

    private static int getSum(int number) {
        return number / 10 + number % 10;
    }
}
