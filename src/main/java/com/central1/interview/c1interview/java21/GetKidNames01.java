package com.central1.interview.c1interview.java21;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Nov. 2024,
public class GetKidNames01 {
    static Predicate<Person> lessThan18 = person -> person.getAge() < 18;

    public static Set<String> getKidNames(List<Person> people) {
        if(people.isEmpty()) {
            return new HashSet<>();
        }

        //Objects.requireNonNull(people);
        //Set<String> kids = new HashSet<>();

        return people.stream()
                .filter(lessThan18::test)
                .map(Person::getName)
                .collect(Collectors.toSet());

//        for (Person person : people) {
//            if (person.getAge() < 18) {
//                kids.add(person.getName());
//            }
//        }
//
//        return kids;
    }
}
