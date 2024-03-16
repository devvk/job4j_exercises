package ru.job4j.condition;

import java.util.StringJoiner;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        boolean found = false;
        String str = Integer.toString(num);
        StringJoiner sj = new StringJoiner(" ");

        for (char c : str.toCharArray()) {
            int i = c - '0';
            if (i != 0 && num % i == 0) {
                found = true;
                sj.add(Integer.toString(i));
            }
        }
        System.out.println(found ? sj : "Таких чисел нет");
    }
}
