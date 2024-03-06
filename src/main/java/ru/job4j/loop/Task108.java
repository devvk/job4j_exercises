package ru.job4j.loop;

public class Task108 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 999) {
                break;
            }
            sum += num;
            System.out.println(num);
        }
        System.out.println("Сумма: " + sum);
    }
}
