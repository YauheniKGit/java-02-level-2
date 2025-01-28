package com.yk.pack9FuncProg;

import java.util.stream.Stream;

public class Less50MapReduce {


    public static void main(String[] args) {

        Stream.of(
                        new Less50Student(18, "Ivan"),
                        new Less50Student(23, "Jack"),
                        new Less50Student(19, "Sam"),
                        new Less50Student(27, "Tom"),
                        new Less50Student(19, "Brandon"),
                        new Less50Student(17, "Alex"),
                        new Less50Student(68, "Petr"),
                        new Less50Student(101, "Kate")
                )
                .sequential()
                .map(Less50Student::getAge)
                .reduce(Math::min)
                .ifPresent(System.out::println);




    }


}
