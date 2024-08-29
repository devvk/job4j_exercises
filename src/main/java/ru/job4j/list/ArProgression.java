package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        if (data == null || data.size() < 2) {
            return 0;
        }
        int sum = data.getFirst() + data.getLast();
        for (int i = 1; i < data.size() - 1; i++) {
            int prev = data.get(i - 1);
            int current = data.get(i);
            int next = data.get(i + 1);
            if (current == (prev + next) / 2) {
                sum += data.get(i);
            } else {
                sum = 0;
                break;
            }
        }
        return sum;
    }
}
