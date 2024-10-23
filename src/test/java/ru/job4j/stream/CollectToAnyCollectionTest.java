package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectToAnyCollectionTest {

    @Test
    public void test() {
        List<Integer> data = List.of(2, 4, 6, 1, 22);
        String expectedClass = "java.util.LinkedHashSet";
        String resultClass = CollectToAnyCollection.collect(data.stream()).getClass().getName();
        assertThat(resultClass).isEqualTo(expectedClass);
    }
}
