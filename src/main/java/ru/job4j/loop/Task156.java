package ru.job4j.loop;

public class Task156 {
    public static void loop(int num) {
        for (int i = 1; i <= num; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sb.append("+");
                }
            }
            System.out.println(sb);
        }
    }
}
