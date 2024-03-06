package ru.job4j.loop;

public class Task106 {
    public static void loop(int[] nums) {
        for (int number : nums) {
            if (number == 0) {
                break;
            }
            System.out.println(number);
        }
    }
}
