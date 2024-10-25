package ru.job4j.stream;

import java.util.List;

public class FilterObject {

    public record User(String name, int age) {
    }

    public static List<User> filter(List<User> users) {
        return users.stream()
                .filter(user -> user.name().startsWith("B"))
                .filter(user -> user.age() > 18)
                .toList();
    }
}
