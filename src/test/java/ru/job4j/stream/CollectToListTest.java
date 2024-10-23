package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectToListTest {
    @Test
    public void test() {
        List<Integer> input = List.of(1, 2);
        List<Integer> expected = List.of(1, 2);
        assertThat(CollectToList.collect(input.stream())).isEqualTo(expected);
    }
}
