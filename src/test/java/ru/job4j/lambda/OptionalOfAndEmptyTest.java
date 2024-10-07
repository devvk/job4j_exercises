package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionalOfAndEmptyTest {

    @Test
    public void whenExists() {
        assertEquals(
                Optional.of("c"),
                OptionalOfAndEmpty.findValue(
                        List.of("a", "b", "c"),
                        "c"
                )
        );
    }

    @Test
    public void whenNotExists() {
        assertEquals(
                Optional.empty(),
                OptionalOfAndEmpty.findValue(
                        List.of("a", "b", "c"),
                        "d"
                )
        );
    }
}
