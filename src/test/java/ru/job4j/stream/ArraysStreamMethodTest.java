package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArraysStreamMethodTest {
    @Test
    public void test() {
        Integer[] data = {1, 2, 3};
        long result = ArraysStreamMethod.createStream(data).count();
        long expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}
