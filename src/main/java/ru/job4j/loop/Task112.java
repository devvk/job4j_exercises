package ru.job4j.loop;

public class Task112 {
    public static void loop(int num, int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (num - i > 0) {
                num -= i;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
