package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedWithComparatorTest {
    @Test
    public void test() {
        assertEquals(
                List.of("c", "b", "a"),
                SortedWithComparator.sorted(List.of("a", "b", "c"))
        );
    }
}
