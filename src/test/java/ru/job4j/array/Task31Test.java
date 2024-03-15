package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task31Test {

    @Test
    public void whenWinOdd() {
        int expected = Task31.whoWin(new int[]{5, 10, 4, 3});
        assertThat(2).isEqualTo(expected);
    }

    @Test
    public void whenWiEven() {
        int expected = Task31.whoWin(new int[]{10, 5, 4, 3});
        assertThat(1).isEqualTo(expected);
    }

    @Test
    public void whenNobody() {
        int expected = Task31.whoWin(new int[]{6, 5, 4, 5});
        assertThat(0).isEqualTo(expected);
    }
}
