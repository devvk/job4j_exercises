package ru.job4j.loop;

public class Task65 {
    public static void loop(int[] nums) {
        int negative = 0;
        int positive = 0;
        for (int i : nums) {
            if (i < 0) {
                negative++;
            } else if (i > 0) {
                positive++;
            }
        }
        System.out.println(negative == positive ? "Да" : "Нет");
    }
}
