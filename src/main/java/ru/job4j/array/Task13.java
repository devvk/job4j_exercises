package ru.job4j.array;

public class Task13 {
    public static int[] resolve(int number) {
        String[] tmp = String.valueOf(number).split("");
        int[] result = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            result[i] = Integer.parseInt(tmp[tmp.length - 1 - i]);
        }
        return result;
    }
}
