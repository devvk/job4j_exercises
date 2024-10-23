package ru.job4j.stream;

import java.util.List;

public class UserMap {

    public record User(int age) {
    }

    public static List<User> map(List<Integer> ages) {
        return ages.stream()
                .map(User::new)
                .toList();
    }
}
