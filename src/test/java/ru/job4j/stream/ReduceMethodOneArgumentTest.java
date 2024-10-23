package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ReduceMethodOneArgumentTest {

    @Test
    public void test() {
        assertThat(ReduceMethodOneArgument.reduce(List.of(1))).isEqualTo(Integer.valueOf(1));
        assertThat(ReduceMethodOneArgument.reduce(List.of(1, 2, 3))).isEqualTo(Integer.valueOf(6));
        assertThat(ReduceMethodOneArgument.reduce(List.of(1, 2, 3, 4)))
                .isEqualTo(Integer.valueOf(24));
    }
}
