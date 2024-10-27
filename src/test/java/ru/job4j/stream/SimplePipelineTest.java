package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplePipelineTest {

    @Test
    public void whenNotPipes() {
        List<Integer> expected = List.of(1);
        List<Integer> result = SimplePipeline.of(1)
                .collect();
        assertEquals(expected, result);
    }

    @Test
    public void whenFilter() {
        List<Integer> expected = List.of(10);
        List<Integer> result = SimplePipeline.of(1, 10)
                .filter(el -> el > 1)
                .collect();
        assertEquals(expected, result);
    }

    @Test
    public void whenMap() {
        List<Integer> expected = List.of(1, 100);
        List<Integer> result = SimplePipeline.of(1, 10)
                .map(el -> el * el)
                .collect();
        assertEquals(expected, result);
    }

    @Test
    public void whenFilterMap() {
        List<Integer> expected = List.of(100);
        List<Integer> result = SimplePipeline.of(1, 10)
                .filter(el -> el > 1)
                .map(el -> el * el)
                .collect();
        assertEquals(expected, result);
    }

    @Test
    public void whenMapFilter() {
        List<Integer> expected = List.of(1);
        List<Integer> result = SimplePipeline.of(1, 10)
                .map(el -> el * el)
                .filter(el -> el < 10)
                .collect();
        assertEquals(expected, result);
    }

    @Test
    public void whenFilterMapFilter() {
        List<Integer> expected = List.of(9);
        List<Integer> result = SimplePipeline.of(1, 2, 3, 4)
                .filter(el -> el > 2)
                .map(el -> el * el)
                .filter(el -> el < 10)
                .collect();
        assertEquals(expected, result);
    }
}