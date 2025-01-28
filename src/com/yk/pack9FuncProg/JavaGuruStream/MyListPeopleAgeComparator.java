package com.yk.pack9FuncProg.JavaGuruStream;

import java.util.Comparator;

public class MyListPeopleAgeComparator implements Comparator<People> {


    @Override
    public int compare(People o1, People o2) {
        return o1.getAge() - o2.getAge();
    }
}
