package ru.job4j.loop;

public class Task97 {
    public static void loop(int[] num) {
        int min = num[0];
        int id = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                id = i;
            }
        }
        System.out.printf("Время: %d, номер: %d%n", min, id);
    }
}
