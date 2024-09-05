package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysSortTest {

    @Test
    public void test() {
        long[] data = {3, 2, 1};
        long[] result = ArraysSort.sort(data);
        long[] expect = {1, 2, 3};
        assertArrayEquals(expect, result, "Arrays should be equal");
    }

}
