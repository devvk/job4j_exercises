package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamMethodTest {
    @Test
    public void whenUserStreamMethod() {
        long result = StreamMethod.createStream(List.of(1, 2, 3)).count();
        long expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}
