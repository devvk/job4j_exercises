package ru.job4j.array;

import java.util.StringJoiner;

public class Task75 {
    public static void array(int[] nums) {
        StringJoiner result = new StringJoiner(", ");
        int[] frequency = getFrequency(nums);
        StringJoiner often = new StringJoiner(" ");
        StringJoiner never = new StringJoiner(" ");
        StringJoiner rarely = new StringJoiner(" ");

        for (int i = 1; i < frequency.length; i++) {
            result.add(String.format("%d: %d", i, frequency[i]));
        }

        int max = 0;
        int min = 10;
        for (int number : frequency) {
            if (number > max) {
                max = number;
            }
            if (number < min && number > 0) {
                min = number;
            }
        }

        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] == max) {
                often.add(String.valueOf(i));
            }
            if (frequency[i] == 0) {
                never.add(String.valueOf(i));
            }
            if (frequency[i] == min) {
                rarely.add(String.valueOf(i));
            }
        }
        System.out.println(result);
        System.out.printf("Чаще: %s, отсутствует: %s, реже: %s%n",
                min == max ? 0 : often,
                never,
                min == max ? 0 : rarely);

    }

    public static int[] getFrequency(int[] nums) {
        int[] frequency = new int[10];
        for (int number : nums) {
            frequency[number]++;
        }
        return frequency;
    }
}
