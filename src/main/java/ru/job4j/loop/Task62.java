package ru.job4j.loop;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int unsatisfactory = 0;
        for (int i : grades) {
            if (i < 3) {
                unsatisfactory++;
            }
        }
        System.out.println(unsatisfactory > amount / 2 ? "Да" : "Нет");
    }
}
