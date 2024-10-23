package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class CountMethodTest {

    @Test
    public void test() {
        long result = CountMethod.count(Stream.of(1, 2, 3));
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

}