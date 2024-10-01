package ru.job4j.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LimitedCache<K, V> {
    private final int capacity;
    private final Map<K, V> cache;

    public LimitedCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LimitedCache.this.capacity;
            }
        };
    }

    public void put(K key, V value) {
        cache.put(key, value);
    }

    public V get(K key) {
        return cache.getOrDefault(key, null);
    }

    public int size() {
        return cache.size();
    }

    public static void main(String[] args) {
        LimitedCache<Integer, Integer> cache = new LimitedCache<>(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        cache.put(5, 5);
        System.out.println("size: " + cache.size());
        for (Map.Entry<Integer, Integer> entry : cache.cache.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
