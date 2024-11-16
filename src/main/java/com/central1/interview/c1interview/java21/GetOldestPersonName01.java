package com.central1.interview.c1interview.java21;

import java.util.Comparator;
import java.util.List;

// Nov. 2024,
public class GetOldestPersonName01 {
    static Comparator<Person> personComparator = Comparator.comparing(Person::getAge);

    public static Person getOldestPerson(List<Person> people) {
        Person oldestPerson = new Person("", 0);

        if(people.isEmpty()){
            return oldestPerson;
        }

        return people.stream()
                .max(personComparator)
                .orElse(oldestPerson);

//        for (Person person : people) {
//            if (person.getAge() > oldestPerson.getAge()) {
//                oldestPerson = person;
//            }
//        }
//
//        return oldestPerson;
    }
}
