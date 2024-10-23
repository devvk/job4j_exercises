package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectToAnyMapTest {

    @Test
    public void testContent() {
        List<Integer> data = List.of(2, 3, 3);
        Map<Integer, Integer> expected = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> result = CollectToAnyMap.collect(data.stream());
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testClassName() {
        List<Integer> data = List.of(4, 5, 7, 1, 55);
        String expectedClass = "java.util.LinkedHashMap";
        String resultClass = CollectToAnyMap.collect(data.stream()).getClass().getName();
        assertThat(resultClass).isEqualTo(expectedClass);
    }
}
