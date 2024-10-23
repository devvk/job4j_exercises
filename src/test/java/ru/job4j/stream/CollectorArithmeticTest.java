package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectorArithmeticTest {

    @Test
    public void whenWithout0() {
        int result = CollectorArithmetic.collect(List.of(1, 2, 3));
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWith0() {
        int result = CollectorArithmetic.collect(List.of(0, 2, 3));
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
