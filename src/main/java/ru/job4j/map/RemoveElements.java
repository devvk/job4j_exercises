package ru.job4j.map;

import java.util.List;
import java.util.Map;

public class RemoveElements {
    public static Map<Integer, String> removeElement(Map<Integer, String> data,
                                                     List<Integer> ids,
                                                     List<User> users) {
        for (Integer id : ids) {
            data.remove(id);
        }
        for (User user : users) {
            data.remove(user.id(), user.name());
        }
        return data;
    }

    public record User(int id, String name) {
    }
}
