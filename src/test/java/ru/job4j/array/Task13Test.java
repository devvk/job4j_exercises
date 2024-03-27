package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task13Test {
    @Test
    public void test() {
        assertThat(new int[]{1}).isEqualTo(Task13.resolve(1));
        assertThat(new int[]{2, 1}).isEqualTo(Task13.resolve(12));
        assertThat(new int[]{3, 2, 1}).isEqualTo(Task13.resolve(123));
        assertThat(new int[]{4, 3, 2, 1}).isEqualTo(Task13.resolve(1234));
        assertThat(new int[]{5, 4, 3, 2, 1}).isEqualTo(Task13.resolve(12345));
        assertThat(new int[]{6, 5, 4, 3, 2, 1}).isEqualTo(Task13.resolve(123456));
        assertThat(new int[]{7, 6, 5, 4, 3, 2, 1}).isEqualTo(Task13.resolve(1234567));
        assertThat(new int[]{8, 7, 6, 5, 4, 3, 2, 1}).isEqualTo(Task13.resolve(12345678));
        assertThat(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}).isEqualTo(Task13.resolve(123456789));
    }
}
