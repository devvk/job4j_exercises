package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReductionWithTwoArgumentsTest {
    @Test
    public void test() {
        assertThat(ReductionWithTwoArguments.collect(List.of())).isEqualTo(Integer.valueOf(5));
        assertThat(ReductionWithTwoArguments.collect(List.of(1))).isEqualTo(Integer.valueOf(5));
        assertThat(ReductionWithTwoArguments.collect(List.of(1, 2))).isEqualTo(Integer.valueOf(10));
        assertThat(ReductionWithTwoArguments.collect(List.of(1, 2, 3)))
                .isEqualTo(Integer.valueOf(30));
    }
}
