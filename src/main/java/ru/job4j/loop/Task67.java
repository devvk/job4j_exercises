package ru.job4j.loop;

public class Task67 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println(count == 2 ? "Да" : "Нет");
    }
}
