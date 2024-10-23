package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectToSetTest {
    @Test
    public void test() {
        Set<Integer> input = Set.of(1, 2);
        Set<Integer> expected = Set.of(1, 2);
        assertThat(CollectToSet.collect(input.stream())).isEqualTo(expected);
    }
}
