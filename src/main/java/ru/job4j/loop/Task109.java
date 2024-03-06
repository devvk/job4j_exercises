package ru.job4j.loop;

public class Task109 {
    public static void loop(int[] nums) {
        for (int number : nums) {
            if (number == 123) {
                System.out.println("Код принят");
                break;
            } else {
                System.out.println("Код не принят");
            }
        }
    }
}
