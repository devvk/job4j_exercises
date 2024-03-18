package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {
    @Test
    public void checkMainOutput() {
        var methods = Task3.class.getDeclaredMethods();
        assertThat(methods.length).isEqualTo(2);
        var method = methods[1];
        assertThat(method.getName()).isEqualTo("output");
        var params = method.getParameters();
        assertThat(params.length).isEqualTo(1);
        assertThat(params[0].getType().getName()).isEqualTo(String.class.getName());
    }
}
