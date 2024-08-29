package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        if (data == null || data.size() < 2) {
            return 0;
        }
        int sum = data.getFirst() + data.getLast();
        for (int i = 1; i < data.size() - 1; i++) {
            if (data.get(i) == (data.get(i - 1) + data.get(i + 1)) / 2) {
                sum += data.get(i);
            } else {
                sum = 0;
                break;
            }
        }
        return sum;
    }
}
