package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task14Test {
    @Test
    public void test() {
        assertThat(new int[]{}).isEqualTo(Task14.diff(new int[]{}, new int[]{}));
        assertThat(new int[]{1}).isEqualTo(Task14.diff(new int[]{1}, new int[]{}));
        assertThat(new int[]{}).isEqualTo(Task14.diff(new int[]{}, new int[]{1}));
        assertThat(new int[]{1, 3}).isEqualTo(Task14.diff(new int[]{1, 2, 3}, new int[]{2}));
        assertThat(new int[]{1, 3}).isEqualTo(Task14.diff(new int[]{1, 3}, new int[]{2}));
    }
}
