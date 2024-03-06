package ru.job4j.loop;

public class Task110 {
    public static void loop(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int number : nums) {
            if (sum + number < 150) {
                sum += number;
                count++;
            } else {
                break;
            }
        }
        System.out.printf("Сумма: %d, количество: %d%n", sum, count);
    }
}
