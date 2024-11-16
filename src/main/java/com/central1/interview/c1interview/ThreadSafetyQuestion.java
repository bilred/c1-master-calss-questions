package com.central1.interview.c1interview;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafetyQuestion {
    List<Integer> numbers;
    List<Integer> numbersB;

    public void init() {
        numbers = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            numbers.add(i);
        }
    }


    public void showNumbersLOWERThan100() {
        numbersB = new ArrayList<>();
        numbers.parallelStream()
                .forEach(num -> {
                            if (num > 100) {
                                numbersB.add(num);
                            }
                        }
                );

        System.out.println(numbersB.size());
    }

    public static void main(String[] args) {
        ThreadSafetyQuestion s = new ThreadSafetyQuestion();
        s.init();
        s.showNumbersLOWERThan100();
    }
}
