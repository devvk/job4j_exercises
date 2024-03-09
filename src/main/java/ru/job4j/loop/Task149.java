package ru.job4j.loop;

import java.util.Locale;

public class Task149 {
    public static void loop(int[] grades) {
        double avg = 0;
        int counter = 0;
        for (int grade : grades) {
            if (grade < 1 || grade > 5) {
                break;
            }
            avg += grade;
            counter++;
        }
        System.out.printf(Locale.ENGLISH, "%.2f%n", avg / counter);
    }
}
