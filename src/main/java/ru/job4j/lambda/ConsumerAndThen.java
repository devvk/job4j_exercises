package ru.job4j.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer() {
        Consumer<String> print = System.out::print;
        Consumer<String> ln = s -> System.out.println();
        return print.andThen(ln);
    }
}
