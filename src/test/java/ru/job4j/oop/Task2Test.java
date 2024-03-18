package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {
    @Test
    public void checkMainOutput() {
        var methods = Task2.class.getDeclaredMethods();
        assertThat(methods.length).isEqualTo(2);
        assertThat(methods[1].getName()).isEqualTo("happyXmas");
    }
}