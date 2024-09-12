package ru.job4j.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UniqueWordsFinder {

    public List<String> findUniqueWords(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }
        return uniqueWords;
    }
}
