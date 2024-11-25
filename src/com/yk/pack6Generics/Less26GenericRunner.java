package com.yk.pack6Generics;

public class Less26GenericRunner {

    public static void main(String[] args) {
        Less26List<String> list = new Less26List<>(10);
        list.add("String1");
        list.add("String3");

        list.getByIndex(1);


    }
}
