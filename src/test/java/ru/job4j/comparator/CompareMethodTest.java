package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareMethodTest {

    @Test
    public void testAscending() {
        assertEquals(0, CompareMethod.ascendingCompare(1, 1));
        assertEquals(-1, CompareMethod.ascendingCompare(1, 2));
        assertEquals(1, CompareMethod.ascendingCompare(2, 1));
    }

    @Test
    public void testDescending() {
        assertEquals(0, CompareMethod.descendingCompare(1, 1));
        assertEquals(1, CompareMethod.descendingCompare(1, 2));
        assertEquals(-1, CompareMethod.descendingCompare(2, 1));
    }

}
