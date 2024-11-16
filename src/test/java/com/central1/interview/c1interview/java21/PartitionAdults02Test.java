package com.central1.interview.c1interview.java21;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.central1.interview.c1interview.java21.PartitionAdults02.partitionAdults;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

public class PartitionAdults02Test {
    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> people = asList(sara, eva, viktor);

        Map<Boolean, List<Person>> result = partitionAdults(people);

        assertThat(result.get(true)).hasSameElementsAs(asList(viktor, eva));
        assertThat(result.get(false)).hasSameElementsAs(singletonList(sara));
    }
}