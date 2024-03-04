package ru.job4j.loop;

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int on = 0;
        int in = 0;
        for (int i = 0; i < coords.length; i += 2) {
            double formula = Math.pow(x - coords[i], 2) + Math.pow(y - coords[i + 1], 2);
            if (formula == Math.pow(r, 2)) {
                on++;
            } else if (formula < Math.pow(r, 2)) {
                in++;
            }
        }
        System.out.printf("На окружности: %d, внутри: %d%n", on, in);
    }
}
