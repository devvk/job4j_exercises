package ru.job4j.array;

public class Task82 {
    public static int[] array(int[] nums) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int number : nums) {
            if (number > 0) {
                positive += number;
            } else if (number < 0) {
                negative += number;
            } else {
                zeros++;
            }
        }
        return new int[]{positive, negative, zeros};
    }
}
