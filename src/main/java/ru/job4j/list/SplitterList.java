package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class SplitterList {
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        if (left == null || middle == null || right == null) {
            throw new IllegalArgumentException("Input lists must not be null");
        }
        List<String> result = new ArrayList<>(left);
        result.retainAll(middle);
        result.removeAll(right);
        return result;
    }
}
