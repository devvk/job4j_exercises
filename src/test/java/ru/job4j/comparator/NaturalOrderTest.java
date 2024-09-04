package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NaturalOrderTest {

    @Test
    public void test() {
        assertEquals(Comparator.naturalOrder(), NaturalOrder.naturalOrder());
    }

}