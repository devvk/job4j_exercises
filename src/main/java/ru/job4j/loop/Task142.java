package ru.job4j.loop;

public class Task142 {
    public static void loop(int num) {
        boolean isFibonacci = false;
        int last = 0;
        int next = 1;
        while (next <= num) {
            if (next == num) {
                isFibonacci = true;
                break;
            }
            int sum = last + next;
            last = next;
            next = sum;
        }
        System.out.println(isFibonacci || num == 0 ? "Да" : "Нет");
    }
}
