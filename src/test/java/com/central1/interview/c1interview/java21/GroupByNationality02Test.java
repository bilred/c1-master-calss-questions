package com.central1.interview.c1interview.java21;


import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.central1.interview.c1interview.java21.GroupByNationality02.groupByNationality;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class GroupByNationality02Test {
    @Test
    public void groupByNationalityTest() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> people = asList(sara, eva, viktor);

        Map<String, List<Person>> peoplePerNationality = groupByNationality(people);

        assertThat(peoplePerNationality).hasSize(2);
        assertThat(peoplePerNationality.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(peoplePerNationality.get("Serbian")).hasSameElementsAs(singletonList(viktor));
    }
}