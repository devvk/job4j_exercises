package ru.job4j.loop;

public class Task130 {
    public static void loop(int num) {
        int count = 0;
        String digits = String.valueOf(num);
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == '0') {
                count++;
            }
        }
        System.out.println(count);
    }
}
