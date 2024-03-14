package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task26Test {
    @Test
    public void test() {
        assertThat("Иванов И.И.").isEqualTo(Task26.convert(new String[]{"Иванов", "Иван", "Иваныч"}));
        assertThat("Григорьев И.Н.").isEqualTo(Task26.convert(new String[]{"Григорьев", "Игорь", "Николаевич"}));
    }
}
