package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static ru.job4j.lambda.OptionalOrElseThrow.User;
import static ru.job4j.lambda.OptionalOrElseThrow.UserNotFoundException;

public class OptionalOrElseThrowTest {

    @Test
    public void whenFound() {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        assertEquals(u3.login(), OptionalOrElseThrow.orElseThrow(
                List.of(u1, u2, u3), u3.login()).login());
    }

    @Test(expected = UserNotFoundException.class)
    public void whenNotFound() {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        OptionalOrElseThrow.orElseThrow(List.of(u1, u2, u3), "u4");
    }
}
