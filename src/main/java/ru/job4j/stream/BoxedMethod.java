package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class BoxedMethod {
    public static List<Integer> boxed(int[] data) {
        return Arrays.stream(data)
                .boxed()
                .toList();
    }
}
