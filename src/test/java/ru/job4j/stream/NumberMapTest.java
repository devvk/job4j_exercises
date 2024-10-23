package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberMapTest {

    @Test
    public void test() {
        List<Integer> input = List.of(2, 3, 4);
        List<Integer> expected = List.of(4, 9, 16);
        assertEquals(expected, NumberMap.map(input));
    }

}
