package com.yk.pack7Collections;

import java.util.HashMap;
import java.util.Map;

public class Less36HashMap {

    public static void main(String[] args) {
        Less35Person tom = new Less35Person(1, "Tom", "Cruz");
        Less35Person jack = new Less35Person(2, "Jack", "Bush");

        Map<Integer, Less35Person> mapPerson = new HashMap<>();
        mapPerson.put(tom.getId(), tom);
        mapPerson.put(jack.getId(), jack);


//        System.out.println(mapPerson.get(2));
//        System.out.println();
//        System.out.println(mapPerson.keySet());
//        System.out.println(mapPerson.values());
//        System.out.println(mapPerson.entrySet()); //Nodes
//
//        for (Less35Person per : mapPerson.values()) {
//            System.out.println(per.getFirstName());
//        }


    }


}
