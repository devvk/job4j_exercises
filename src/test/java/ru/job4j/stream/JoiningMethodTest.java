package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

public class JoiningMethodTest {

    @Test
    public void test() {
        String result = JoiningMethod.join(List.of("A", "B", "C"));
        StringJoiner expected = new StringJoiner(System.lineSeparator(), "Prefix", "Suffix");
        expected.add("A");
        expected.add("B");
        expected.add("C");
        assertThat(result).isEqualTo(expected.toString());
    }
}
