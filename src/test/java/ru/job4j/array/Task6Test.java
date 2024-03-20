package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task6Test {

    @Test
    public void test() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        assertThat("car").isEqualTo(Task6.random(prizes, 1));
        assertThat("ticket").isEqualTo(Task6.random(prizes, 2));
        assertThat("flat").isEqualTo(Task6.random(prizes, 3));
        assertThat("house").isEqualTo(Task6.random(prizes, 4));

        assertThat("car").isEqualTo(Task6.random(prizes, 5));
        assertThat("ticket").isEqualTo(Task6.random(prizes, 6));
        assertThat("flat").isEqualTo(Task6.random(prizes, 7));
        assertThat("house").isEqualTo(Task6.random(prizes, 8));

        assertThat("car").isEqualTo(Task6.random(prizes, 9));
        assertThat("ticket").isEqualTo(Task6.random(prizes, 10));
        assertThat("flat").isEqualTo(Task6.random(prizes, 11));
        assertThat("house").isEqualTo(Task6.random(prizes, 12));
    }
}
