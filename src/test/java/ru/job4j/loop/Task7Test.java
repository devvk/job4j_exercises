package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task7Test {
    @Test
    public void test() {
        assertEquals(4, Task7.calculate(2, 2));
        assertEquals(9, Task7.calculate(3, 2));
        assertEquals(3, Task7.calculate(3, 1));
        assertEquals(128, Task7.calculate(2, 7));
    }
}