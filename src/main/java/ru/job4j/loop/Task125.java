package ru.job4j.loop;

import java.util.StringJoiner;

public class Task125 {
    public static void loop(int num) {
        StringJoiner sjEven = new StringJoiner(" ");
        StringJoiner sjOdd = new StringJoiner(" ");
        String digits = String.valueOf(num);

        for (int i = 0; i < digits.length(); i++) {
            int firstDigit = Integer.parseInt(digits.charAt(i) + "");
            if (firstDigit % 2 == 0) {
                sjEven.add(String.valueOf(firstDigit));
            } else {
                sjOdd.add(String.valueOf(firstDigit));
            }
        }

        if (sjEven.length() > 0) {
            System.out.println(sjEven);
        }
        if (sjOdd.length() > 0) {
            System.out.println(sjOdd);
        }
    }
}
