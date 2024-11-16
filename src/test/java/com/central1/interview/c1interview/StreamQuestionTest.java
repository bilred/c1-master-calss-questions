package com.central1.interview.c1interview;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StreamQuestionTest {

    private final StreamQuestion streamQuestion = new StreamQuestion();

    @Test
    public void testFindStringsWithLength() {
        final List<String> strings = List.of("Hello", "World", "Hi", "Hoi");

        final List<String> stringsWithLength = streamQuestion.findStringsWithLength(strings, 5);

        assertThat(stringsWithLength).containsExactly("Hello", "World");
    }

    @Test
    public void testFindStringsWithLengthNoResult() {
        final List<String> strings = List.of("Hello", "World", "Hi", "Hoi");

        final List<String> stringsWithLength = streamQuestion.findStringsWithLength(strings, 10);

        assertThat(stringsWithLength).isEmpty();
    }
}