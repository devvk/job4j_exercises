package ru.job4j.stream;

import java.util.List;

public class OptionalStream {

    public record PhoneNumber(String phone) {
    }

    public record User(int id, List<PhoneNumber> numbers) {
    }

    public static List<PhoneNumber> collectNumber(List<User> users, int id, String region) {
        return users.stream()
                .filter(user -> user.id() == id)
                .flatMap(numbers -> numbers.numbers().stream())
                .filter(number -> number.phone().startsWith(region))
                .toList();
    }
}
