package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task33Test {
    @Test
    public void calculateIs18() {
        int[] data = {10, 15, 20, 2, 10, 6};
        int result = Task33.calculate(data);
        assertThat(result).isEqualTo(18);
    }

    @Test
    public void calculateIs24() {
        int[] data = {-3, 4, -9, -1, -2, 15};
        int result = Task33.calculate(data);
        assertThat(result).isEqualTo(24);
    }
}
