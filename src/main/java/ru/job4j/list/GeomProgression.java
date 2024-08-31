package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>();
        int currentElement = first;
        for (int i = 0; i < count; i++) {
            list.add(currentElement);
            currentElement *= denominator;
        }
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
