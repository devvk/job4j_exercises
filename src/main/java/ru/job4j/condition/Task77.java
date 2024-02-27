package ru.job4j.condition;

public class Task77 {
    public static void diffNumAmount(int num) {
        String str = Integer.toString(num);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
