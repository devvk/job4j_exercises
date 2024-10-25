package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlatMapForObjectTest {
    @Test
    public void test() {
        List<Integer> expected = List.of(1, 2, 3, 4);
        List<Integer> result = FlatMapForObject.flatMap(List.of(
                List.of(1, 2),
                List.of(3, 4)
        ));
        assertEquals(expected, result);
    }
}
