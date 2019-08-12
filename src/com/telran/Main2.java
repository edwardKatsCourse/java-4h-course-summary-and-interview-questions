package com.telran;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//top level vs nested
public class Main2 {

    public static void main(String[] args) {
        Person p1 = new Person("Name", LocalDate.of(2019, 8, 12));
        Person p2 = new Person("Name", LocalDate.of(2019, 8, 12));
        Person p3 = new Person("Name", LocalDate.of(2019, 8, 12));

        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        System.out.println(personSet.size());

        String s1 = new String("a");
        String s2 = new String("a");
        String s3 = new String("a");

        Set<String> strings = new HashSet<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);

        System.out.println(strings.size());


        System.out.println("--------------");

        //System.out.println(p1.equals(p2));      //true|false

        Color c1 = Color.RED;
        Color c2 = Color.RED;

        System.out.println(c1.getPerson() == c2.getPerson());

    }
}

enum Color {
    BLUE(new Person("Name", LocalDate.of(2019, 8, 8))),
    RED(new Person("Name", LocalDate.of(2019, 8, 8)));

    private Person person;

    Color(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}

//top level vs nested
class Person {

    private String name;
    private LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                dateOfBirth.equals(person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth);
    }
}
