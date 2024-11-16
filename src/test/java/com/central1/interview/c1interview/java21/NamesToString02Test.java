package com.central1.interview.c1interview.java21;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.central1.interview.c1interview.java21.NamesToString02.namesToString;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class NamesToString02Test {
    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);

        final String peopleNames = namesToString(collection);

        assertThat(peopleNames)
                .isEqualTo("Names: Sara, Viktor, Eva.");
    }
}