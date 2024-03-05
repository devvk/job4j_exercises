package ru.job4j.loop;

public class Task84 {
    public static void loop(int previous, int next, int length) {
        int sum = previous + next;
        for (int i = 2; i < length; i++) {
            int tmp = previous;
            previous = next;
            next += tmp;
            sum += next;
        }
        System.out.println(sum);
    }
}
