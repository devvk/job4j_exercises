package ru.job4j.array;

public class Task32 {
    public static boolean check(int[] data) {
        int countPositive = 0;
        int countNegative = 0;
        for (int number : data) {
            if (number > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
        }
        return countNegative % 2 != 0;
    }
}
