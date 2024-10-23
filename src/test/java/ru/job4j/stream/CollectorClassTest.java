package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectorClassTest {

    @Test
    public void test() {
        List<Integer> result = CollectorClass.collect(List.of(1, 2, 3));
        List<Integer> expected = List.of(1, 2, 3);
        assertThat(result).isEqualTo(expected);
    }

}
