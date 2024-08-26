package ru.job4j.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SubListTest {

    private final List<String> list = new ArrayList<>(Arrays.asList(
            "one", "two", "three", "four", "five", "six", "seven", "eight", "three", "ten")
    );

    @Test
    public void getElementsBetweenIndexes() {
        List<String> result = SubList.getElementsBetweenIndexes(list, "three");
        List<String> expected = List.of("three", "four", "five", "six", "seven", "eight");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getElementsBetweenIndexesEmptyList() {
        List<String> result = SubList.getElementsBetweenIndexes(list, "five");
        List<String> expected = List.of();
        assertThat(result).isEqualTo(expected);
    }
}
