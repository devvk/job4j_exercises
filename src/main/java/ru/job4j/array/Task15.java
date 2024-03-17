package ru.job4j.array;

public class Task15 {
    public static int[] checkEmptyPlace(char[][] places) {
        int size = places.length;
        int[] rsl = {};
        for (int i = 0; i < size; i++) {
            if (places[i][i] == 'O') {
                rsl = new int[]{i, i};
                break;
            } else if (places[i][size - 1 - i] == 'O') {
                rsl = new int[]{i, size - 1 - i};
                break;
            }
        }
        return rsl;
    }
}

