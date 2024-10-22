package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamBuilderTest {
    @Test
    public void test() {
        Integer[] data = {1, 2, 3};
        Stream<Object> stream = StreamBuilder.createStream(data);
        List<Integer> result = stream.map(v -> (Integer) v).collect(Collectors.toList());
        List<Integer> expected = List.of(1, 3);
        assertThat(result).isEqualTo(expected);
    }
}
