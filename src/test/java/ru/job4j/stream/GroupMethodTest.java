package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupMethodTest {
    @Test
    public void test() {
        GroupMethod.User u1 = new GroupMethod.User(10, "Ivan");
        GroupMethod.User u2 = new GroupMethod.User(10, "Boris");
        GroupMethod.User u3 = new GroupMethod.User(15, "Semen");
        GroupMethod.User u4 = new GroupMethod.User(20, "Petr");
        Map<Integer, List<GroupMethod.User>> expected = Map.of(
                10, List.of(u1, u2),
                15, List.of(u3),
                20, List.of(u4)
        );
        assertThat(GroupMethod.groupBy(List.of(u1, u2, u3, u4))).isEqualTo(expected);
    }
}
