package ru.job4j.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Info info : list) {
            map.merge(info.city(), info.rainfall(), Integer::sum);
        }
        List<Info> rsl = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            rsl.add(new Info(entry.getKey(), entry.getValue()));
        }
        return rsl;
    }

    public record Info(String city, int rainfall) {

    }
}