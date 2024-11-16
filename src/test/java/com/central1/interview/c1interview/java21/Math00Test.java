package com.central1.interview.c1interview.java21;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.central1.interview.c1interview.java21.Math00.calculate;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class Math00Test {

    @Test
    public void calculateShouldSumAllNumbers() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);

        final int sum = calculate(numbers);

        assertThat(sum).isEqualTo(1 + 2 + 3 + 4 + 5);
    }
}