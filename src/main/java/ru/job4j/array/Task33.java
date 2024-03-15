package ru.job4j.array;

public class Task33 {
    public static int calculate(int[] data) {
        int min = data[0];
        int max = data[0];
        for (int number : data) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return max - min;
    }
}
