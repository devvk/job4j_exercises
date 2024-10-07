package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MRPredicateTest {

    @Test
    public void test() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertTrue(predicate.test(""));
        assertFalse(predicate.test("a"));
    }
}
