package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DestroySequenceTest {
    @Test
    public void test() {
        assertThat("0000011111".toCharArray()).
                isEqualTo(DestroySequence.destroy("1111100000".toCharArray()));
        assertThat("00000011111".toCharArray()).
                isEqualTo(DestroySequence.destroy("11111000000".toCharArray()));
        assertThat("0000001011111".toCharArray()).
                isEqualTo(DestroySequence.destroy("1111101000000".toCharArray()));
    }
}
