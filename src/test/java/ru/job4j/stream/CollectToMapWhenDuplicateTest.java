package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectToMapWhenDuplicateTest {
    @Test
    public void test() {
        List<Integer> data = List.of(2, 3, 3);
        Map<Integer, Integer> expected = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = CollectToMapWhenDuplicate.collect(data.stream());
        assertThat(result).isEqualTo(expected);
    }
}
