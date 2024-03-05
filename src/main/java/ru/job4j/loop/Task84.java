package ru.job4j.loop;

public class Task84 {
    public static void loop(int previous, int next, int num) {
        int result = previous + next;
        for (int i = 2; i < num; i++) {
            int tmp = previous;
            previous = next;
            next += tmp;
            result += next;
        }
        System.out.println(result);
    }
}
