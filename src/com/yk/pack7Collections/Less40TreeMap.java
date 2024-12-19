package com.yk.pack7Collections;

import java.util.Map;
import java.util.TreeMap;

public class Less40TreeMap {

    public static void main(String[] args) {

        Less35Person jack = new Less35Person(1, "Jack", "Bush");
        Less35Person kate = new Less35Person(5, "Kate", "Ostin");
        Less35Person sveta = new Less35Person(3, "Sveta", "Ivanova");
        Less35Person sam = new Less35Person(19, "Sam", "Genge");

        Map<Integer, Less35Person> mapPerson = new TreeMap<>();
        mapPerson.put(jack.getId(), jack);
        mapPerson.put(kate.getId(), kate);
        mapPerson.put(sveta.getId(), sveta);
        mapPerson.put(sam.getId(), sam);

        for (Map.Entry<Integer, Less35Person> entry : mapPerson.entrySet()) {
            System.out.println(entry);
        }





    }



}
