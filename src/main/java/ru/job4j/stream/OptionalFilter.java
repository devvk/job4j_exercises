package ru.job4j.stream;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalFilter {

    public record Worker(String passport, List<Child> children) {
    }

    public record Child(String name, int age) {
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
        return findByPassport(workers, passport)
                .filter(worker -> worker.children().size() > 2)
                .map(worker -> worker.children().stream()
                        .filter(child -> child.age() < 15)
                        .toList()
                )
                .orElse(Collections.emptyList());
    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(worker -> worker.passport().equals(passport))
                .findFirst();
    }

}
