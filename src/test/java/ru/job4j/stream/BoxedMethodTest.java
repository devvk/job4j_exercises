package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxedMethodTest {

    @Test
    public void test() {
        List<Integer> expected = List.of(1, 2, 3);
        List<Integer> result = BoxedMethod.boxed(new int[]{1, 2, 3});
        assertEquals(expected, result);
    }

}