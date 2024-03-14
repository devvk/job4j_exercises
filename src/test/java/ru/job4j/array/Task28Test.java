package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task28Test {
    @Test
    public void when1021Then9() {
        assertThat(9).isEqualTo(Task28.sum(new int[]{10, 2, 1}));
    }

    @Test
    public void when321Then2() {
        assertThat(2).isEqualTo(Task28.sum(new int[]{3, 2, 1}));
    }

    @Test
    public void when54321Then4() {
        assertThat(4).isEqualTo(Task28.sum(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void when531Then4() {
        assertThat(4).isEqualTo(Task28.sum(new int[]{5, 3, 1}));
    }
}
