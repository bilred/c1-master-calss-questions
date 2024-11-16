package com.central1.interview.c1interview.java21;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static com.central1.interview.c1interview.java21.GetKidNames01.getKidNames;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class GetKidNames01Test {

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsUnder18() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person mike = new Person("Eva", 18);
        Person anna = new Person("Anna", 5);
        List<Person> people = asList(sara, eva, viktor, mike, anna);

        final Set<String> kidNames = getKidNames(people);

        assertThat(kidNames)
                .containsExactlyInAnyOrder("Sara", "Anna")
                .doesNotContain("Viktor", "Eva", "Mike");
    }

    @Test
    public void whenEmptyListShouldReturnEmptySet() {
        getKidNames(null);


    }
}