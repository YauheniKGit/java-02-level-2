package com.yk.pack7Collections;

import com.yk.pack6Generics.Less26List;

public class Less34ListIteratorRunner {

    public static void main(String[] args) {

        Less26List<String> list = new Less26List<>(10);
        list.add("string 1");
        list.add("string 2");
        list.add("string 3");
        list.add("string 4");

        for (String value : list) {
            System.out.println(value);
        }

        list.forEach(System.out::println);

    }


}
