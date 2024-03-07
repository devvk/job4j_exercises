package ru.job4j.loop;

import java.util.StringJoiner;

public class Task123 {
    public static void loop(int num) {
        StringJoiner sj = new StringJoiner(" ");
        while (num >= 10) {
            num = getSum(num);
            sj.add(String.valueOf(num));
        }
        System.out.println(sj);
    }

    private static int getSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
