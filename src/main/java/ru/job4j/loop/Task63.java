package ru.job4j.loop;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        for (int i : answers) {
            if (i == 1) {
                count++;
            }
        }
        System.out.println(count + ", " + (count > answers.length / 2 ? "Да" : "Нет"));
    }
}
