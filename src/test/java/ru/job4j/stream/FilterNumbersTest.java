package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterNumbersTest {
    @Test
    public void test() {
        List<Integer> expected = List.of(2, 4);
        List<Integer> result = FilterNumbers.filter(List.of(1, 2, 3, 4));
        assertEquals(expected, result);
    }
}
