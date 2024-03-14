package ru.job4j.array;

public class Task29 {
    public static int find(int[] date) {
        int result = -1;
        for (int i = 1; i < date.length; i++) {
            if (date[i] - date[i - 1] != 1) {
                result = date[i];
                break;
            }
        }
        return result;
    }
}
