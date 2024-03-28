package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AndArrayTest {

    @Test
    public void test() {
        assertThat(new int[]{}).isEqualTo(AndArray.and(new int[]{1, 2, 3}, new int[]{4, 5}));
        assertThat(new int[]{1}).isEqualTo(AndArray.and(new int[]{1, 2, 3}, new int[]{1, 4, 5}));
        assertThat(new int[]{4, 5}).isEqualTo(AndArray.and(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5}));
    }

}
