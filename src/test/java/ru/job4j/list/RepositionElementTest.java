package ru.job4j.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class RepositionElementTest {
    private final List<String> list = new ArrayList<>(Arrays.asList(
            "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"
    ));

    @Test
    public void changePositionWithValidIndex() {
        int index = 3;
        List<String> result = RepositionElement.changePosition(list, index);
        assertThat(result.size()).isEqualTo(8);
        assertThat(result.get(index)).isEqualTo("nine");
    }

    @Test
    public void changePositionWithInvalidIndex() {
        int index = 20;
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> RepositionElement.changePosition(list, index))
                .withMessageContaining("Index out of bounds");
    }

    @Test
    public void changePositionWithEmptyList() {
        List<String> emptyList = new ArrayList<>();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> RepositionElement.changePosition(emptyList, 0))
                .withMessageContaining("The List is empty");
    }
}