package ru.job4j.loop;

public class Task59 {
    public static void loop(int num, int[] array) {
        int countEqual = 0;
        int countLess = 0;
        for (int i : array) {
            if (i == num) {
                countEqual++;
            } else if (i < num) {
                countLess++;
            }
        }
        System.out.println("Равно: " + countEqual + ", меньше: " + countLess);
    }
}
