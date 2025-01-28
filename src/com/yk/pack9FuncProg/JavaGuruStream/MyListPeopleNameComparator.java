package com.yk.pack9FuncProg.JavaGuruStream;

import java.util.Comparator;

public class MyListPeopleNameComparator implements Comparator<People> {


    @Override
    public int compare(People person1, People person2) {
        return person1.getName().compareTo(person2.getName());
    }
}
