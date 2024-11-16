package com.central1.interview.c1interview.java21;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.central1.interview.c1interview.java21.StringConcat02.getString;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class StringConcat02Test {
    @Test
    public void getStringShouldOutputEvenUnevenString() {
        final List<Integer> numbers = asList(3, 44);

        assertThat(getString(numbers)).isEqualTo("o3,e44");
    }

    @Test
    public void getStringShouldOutputEvenUnevenStringSecondCase() {
        final List<Integer> numbers = singletonList(3);

        assertThat(getString(numbers)).isEqualTo("o3");
    }
}