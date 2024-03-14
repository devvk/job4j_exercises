package ru.job4j.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task29Test {
    @Test
    public void test() {
        Assertions.assertEquals(-1, Task29.find(new int[]{1, 2, 3}));
        Assertions.assertEquals(-1, Task29.find(new int[]{}));
        Assertions.assertEquals(3, Task29.find(new int[]{1, 3}));
        Assertions.assertEquals(3, Task29.find(new int[]{1, 3, 4, 5}));
        Assertions.assertEquals(-1, Task29.find(new int[]{1, 2, 3, 4, 5}));
    }
}
