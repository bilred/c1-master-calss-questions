package com.central1.interview.c1interview.java21;

import java.util.ArrayList;
import java.util.List;

public class TransformList02 {
    public static List<String> transform(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }
}
