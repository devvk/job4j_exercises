package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task26Test {
    @Test
    public void test() {
        String result1 = Task26.convert(new String[]{"Иванов", "Иван", "Иваныч"});
        assertThat("Иванов И.И.").isEqualTo(result1);
        String result2 = Task26.convert(new String[]{"Григорьев", "Игорь", "Николаевич"});
        assertThat("Григорьев И.Н.").isEqualTo(result2);
    }
}
