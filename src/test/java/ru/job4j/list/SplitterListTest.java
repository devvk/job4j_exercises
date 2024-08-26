package ru.job4j.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitterListTest {

    @Test
    public void split() {
        List<String> left = new ArrayList<>(Arrays.asList(
                "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten")
        );
        List<String> middle = List.of(
                "one", "two", "four", "five", "seven", "eight", "nine"
        );
        List<String> right = List.of(
                "two", "five", "nine"
        );
        List<String> rsl = SplitterList.split(left, middle, right);
        assertThat(rsl).isEqualTo(List.of("one", "four", "seven", "eight"));
    }
}
