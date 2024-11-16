package com.central1.interview.c1interview.java21;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.central1.interview.c1interview.java21.TransformList02.transform;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TransformList02Test {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> names = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));

        final List<String> result = transform(names);

        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertThat(result).hasSameElementsAs(expected);
    }
}