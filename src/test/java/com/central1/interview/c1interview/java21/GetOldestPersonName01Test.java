package com.central1.interview.c1interview.java21;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static com.central1.interview.c1interview.java21.GetOldestPersonName01.getOldestPerson;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class GetOldestPersonName01Test {

    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> people = asList(sara, eva, viktor);

        final Person oldestPerson = getOldestPerson(people);

        assertThat(oldestPerson).isEqualToComparingFieldByField(eva);
    }

    @Test
    public void getOldestPersonShouldReturnDefaultPersonIfEmpty() {
        final List<Person> people = Collections.emptyList();

        final Person oldestPerson = getOldestPerson(people);

        assertThat(oldestPerson).isEqualToComparingFieldByField(new Person("", 0));
    }
}