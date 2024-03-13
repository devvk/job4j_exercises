package ru.job4j.array;

public class Task81 {
    public static int[] array(int[] nums) {
        int negative = 0;
        int zeros = 0;
        int positive = 0;
        for (int number : nums) {
            if (number < 0) {
                negative++;
            } else if (number == 0) {
                zeros++;
            } else {
                positive++;
            }
        }
        return new int[]{negative, zeros, positive};
    }
}
