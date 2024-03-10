package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task6Test {

    @Test
    public void test() {
        assertEquals(0, Task6.loop(0, 2));
        assertEquals(2, Task6.loop(1, 2));
        assertEquals(6, Task6.loop(1, 3));
    }

}