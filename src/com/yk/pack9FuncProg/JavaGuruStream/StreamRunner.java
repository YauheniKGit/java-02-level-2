package com.yk.pack9FuncProg.JavaGuruStream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamRunner {

    public static void main(String[] args) {

        List<People> list = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMAN),
                new People("Елена", 33, Sex.WOMAN),
                new People("Елена", 66, Sex.WOMAN),
                new People("Артем", 26, Sex.MAN),
                new People("Маша", 17, Sex.WOMAN),
                new People("Оля", 25, Sex.WOMAN),
                new People("Кирилл", 87, Sex.MAN),
                new People("Иван Иванович", 69, Sex.MAN));

        //1 task
        List<People> armyMan = list.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() <= 27 && person.getSex() == Sex.MAN)
                .toList();
        armyMan.forEach(System.out::println);

        //2 task
        OptionalDouble averageManAge = list.stream()
                .filter(person -> person.getSex().equals(Sex.MAN))
                .mapToInt(People::getAge)
                .average();
        System.out.println(averageManAge.toString());

        //3 task
        List<People> peopleListCanWork = list.stream()
                .filter(person -> person.getAge() >= 18)
                .filter(person ->
                        (person.getSex().equals(Sex.WOMAN) && person.getAge() <= 55)
                                ||
                                (person.getSex().equals(Sex.MAN) && person.getAge() <= 60)
                ).toList();
        System.out.println(peopleListCanWork);

        //task4
        System.out.println();
        list.stream()
                .sorted(new MyListPeopleNameComparator().thenComparing(new MyListPeopleAgeComparator()))
                .forEach(System.out::println);


    }

}
