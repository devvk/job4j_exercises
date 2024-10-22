package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RangeMethodTest {
    @Test
    public void test() {
        List<Integer> result = RangeMethod.createStream(1, 3).boxed().collect(Collectors.toList());
        List<Integer> expected = List.of(1, 2, 3);
        assertThat(result).isEqualTo(expected);
    }
}
