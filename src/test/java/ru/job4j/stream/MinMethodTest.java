package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MinMethodTest {
    @Test
    public void test() {
        assertThat(MinMethod.min(List.of("ccc", "bb", "y"))).isEqualTo("y");
    }
}
