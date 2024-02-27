package ru.job4j.condition;

import java.util.StringJoiner;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        String str = Integer.toString(num);
        boolean found = false;
        StringJoiner sj = new StringJoiner(" ");

        for (char c : str.toCharArray()) {
            int i = c - '0';
            if (i != 0 && num % i == 0) {
                found = true;
                sj.add(Integer.toString(i));
            }
        }

        if (!found) {
            System.out.println("Таких чисел нет");
        } else {
            System.out.println(sj);

        }
    }

    public static void main(String[] args) {
        divWithoutRemainder(234570);
    }
}
