package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOrElseThrow {

    public record User(String login) {
    }

    public static class UserNotFoundException extends RuntimeException {
    }

    public static User orElseThrow(List<User> list, String login) {
        return search(list, login).orElseThrow(UserNotFoundException::new);
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> result = Optional.empty();
        for (User user : list) {
            if (user.login().equals(login)) {
                result = Optional.of(user);
            }
        }
        return result;
    }
}
