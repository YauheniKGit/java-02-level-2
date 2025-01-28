package com.yk.pack7Collections.tasks;

public class Person implements Comparable<Person> {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
        if (name.length() - person.getName().length() > 0) {
            return 1;
        } else if (name.length() - person.getName().length() < 0) {
            return -1;
        } else if (name.length() - person.getName().length() == 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
