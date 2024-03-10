package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task9Test {

    @Test
    public void test() {
        assertEquals(1, Task9.count(1, 2));
        assertEquals(2, Task9.count(1, 3));
        assertEquals(2, Task9.count(1, 4));
        assertEquals(3, Task9.count(1, 5));
    }

}