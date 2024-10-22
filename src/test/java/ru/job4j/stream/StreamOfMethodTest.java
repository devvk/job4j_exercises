package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamOfMethodTest {
    @Test
    public void whenUserStreamMethod() {
        String result = StreamOfMethod.createStream().map(
                Object::toString).collect(Collectors.joining()
        );
        String expected = "abc";
        assertThat(result).isEqualTo(expected);
    }
}
