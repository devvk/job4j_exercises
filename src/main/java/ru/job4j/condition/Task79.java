package ru.job4j.condition;

public class Task79 {
    public static void getCentury(int num) {
        byte century;

        if (num >= 1501 && num <= 2000) {
            if (num <= 1600) {
                century = 16;
            } else if (num <= 1700) {
                century = 17;
            } else if (num <= 1800) {
                century = 18;
            } else if (num <= 1900) {
                century = 19;
            } else {
                century = 20;
            }
            System.out.println(century);
        } else {
            System.out.println("Не попадает в диапазон");
        }
    }
}
