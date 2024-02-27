package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task84Test {
    @Test
    public void checkTrue() {
        boolean check = Task84.check("A8", "E8");
        assertThat(check).isEqualTo(true);
    }

    @Test
    public void checkTrue1() {
        boolean check = Task84.check("H4", "H3");
        assertThat(check).isEqualTo(true);
    }

    @Test
    public void checkFalse() {
        boolean check = Task84.check("A1", "B2");
        assertThat(check).isEqualTo(false);
    }

    @Test
    public void checkFalse1() {
        boolean check = Task84.check("F5", "C8");
        assertThat(check).isEqualTo(false);
    }
}
