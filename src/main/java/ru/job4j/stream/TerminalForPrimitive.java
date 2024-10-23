package ru.job4j.stream;

import java.util.Arrays;

public class TerminalForPrimitive {

    private final int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
        return Arrays.stream(data)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }

    public long min() {
        return Arrays.stream(data)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }

    public double avg() {
        return Arrays.stream(data)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
    }

    public long sum() {
        return Arrays.stream(data).sum();
    }
}