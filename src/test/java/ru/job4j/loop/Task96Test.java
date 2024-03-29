package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task96Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when21And23And27And19And22Then19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {21, 23, 27, 19, 22};
        Task96.loop(num);
        String expected = "19" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when35And36And37And34And38Then34() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {35, 36, 37, 34, 38};
        Task96.loop(num);
        String expected = "34" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when20And22And24And26And18Then18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {20, 22, 24, 26, 18};
        Task96.loop(num);
        String expected = "18" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

}
