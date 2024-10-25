package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlatMapForPrimitiveTest {
    @Test
    public void test() {
        int expected = 15;
        int result = FlatMapForPrimitive.sum(new int[][]{
                {1, 2, 3},
                {4, 5}
        });
        assertEquals(expected, result);
    }
}
