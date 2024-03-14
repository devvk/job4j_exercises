package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task27Test {

    @Test
    public void test() {
        assertThat("Hello World").isEqualTo(Task27.convert(new String[]{"Hello", "World"}));
        assertThat("one two three").isEqualTo(Task27.convert(new String[]{"one", "two", "three"}));
        assertThat("one").isEqualTo(Task27.convert(new String[]{"one"}));
    }

}
