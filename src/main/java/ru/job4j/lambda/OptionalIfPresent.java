package ru.job4j.lambda;

import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent((i) -> System.out.println("Max: " + i));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length == 0) {
            return Optional.empty();
        }
        int max = Integer.MIN_VALUE;
        for (int i : data) {
            if (i > max) {
                max = i;
            }
        }
        return Optional.of(max);
    }
}
