package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task147Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when10And255721Then4And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {2, 5, 5, 7, 2, 1};
        Task147.loop(10, nums);
        String expected = "Покупатели: 4, отказано: 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10And2997221Then3And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {2, 9, 9, 7, 2, 2, 1};
        Task147.loop(10, nums);
        String expected = "Покупатели: 3, отказано: 4" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10And821AThen2And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {8, 2, 1};
        Task147.loop(10, nums);
        String expected = "Покупатели: 2, отказано: 1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when5And678562Then1And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {6, 7, 8, 5, 6, 2};
        Task147.loop(5, nums);
        String expected = "Покупатели: 1, отказано: 5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
