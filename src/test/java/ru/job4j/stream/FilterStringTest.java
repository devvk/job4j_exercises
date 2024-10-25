package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterStringTest {

    @Test
    public void test() {
        List<String> expected = List.of("Abc.java");
        List<String> result = FilterString.filter(List.of("Abc.java", "abc.java", "Abc"));
        assertEquals(expected, result);
    }
}
