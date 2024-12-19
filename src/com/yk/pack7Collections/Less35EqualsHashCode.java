package com.yk.pack7Collections;

public class Less35EqualsHashCode {

    public static void main(String[] args) {

        Less35Person tom = new Less35Person(1, "Tom", "Cruz");
        Less35Person jack = new Less35Person(1, "Tom", "Cruz");
//        Less35Person jack = new Less35Person(2, "Jack", "Gilton");

        System.out.println(tom.hashCode()); //4752546
        System.out.println(jack.hashCode()); //4752546
        System.out.println(tom.equals(jack)); //true


    }


}
