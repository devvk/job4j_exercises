package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task32Test {
    @Test
    public void checkTrue() {
        int[] data = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean expected = Task32.check(data);
        assertThat(true).isEqualTo(expected);
    }

    @Test
    public void checkFalse() {
        int[] data = {-4, -3, -2, -1, 1, 2, 3, 4};
        boolean expected = Task32.check(data);
        assertThat(false).isEqualTo(expected);
    }
}
