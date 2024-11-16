package com.central1.interview.c1interview.java21;

import java.util.List;

public class Math00 {
    public static int calculate(List<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
