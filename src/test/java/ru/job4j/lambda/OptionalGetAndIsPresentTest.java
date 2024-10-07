package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionalGetAndIsPresentTest {

    @Test
    public void whenExist() {
        assertEquals(
                1,
                OptionalGetAndIsPresent.get(
                        new int[]{1, 2, 3},
                        2
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                -1,
                OptionalGetAndIsPresent.get(
                        new int[]{1, 2, 3},
                        4
                )
        );
    }

}
