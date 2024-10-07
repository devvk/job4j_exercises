package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PredicateCheckEvenAndPositiveTest {

    @Test
    public void test() {
        assertTrue(PredicateCheckEvenAndPositive.check(2));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
        assertFalse(PredicateCheckEvenAndPositive.check(1));
    }
}
