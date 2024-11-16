package com.central1.interview.c1interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamQuestion {

    /**
     * @param strings the list of strings to search
     * @param length the length of the strings to find
     * @return the sublist of strings of the desired length
     */
    public List<String> findStringsWithLength(List<String> strings, int length) {
        final List<String> result = new ArrayList<String>();
        final Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            final String next = iterator.next();
            if (next.length() == length) {
                result.add(next);
            }
        }
        return result;
    }
}
