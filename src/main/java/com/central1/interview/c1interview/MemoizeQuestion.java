package com.central1.interview.c1interview;

import java.util.concurrent.ConcurrentHashMap;

public class MemoizeQuestion {
    private final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    public String getSomething(String key) {
        String value = cache.get(key);
        if (value == null) {
            value = calculateSomethingVeryExpensive(key);
            cache.put(key, value);
        }
        return value;
    }

    private String calculateSomethingVeryExpensive(String key) {
        // This method takes a long time, which is why we have a cache!
        return "somethingComplicated";
    }
}
