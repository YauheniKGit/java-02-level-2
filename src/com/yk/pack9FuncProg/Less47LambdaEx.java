package com.yk.pack9FuncProg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Less47LambdaEx {

    public static void main(String[] args) {

        Comparator<String> stringComparator = String::compareTo;

        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("W");
        stringArrayList.add("E");
        stringArrayList.add("C");
        stringArrayList.add("V");

        stringArrayList.sort(stringComparator);

        System.out.println(stringArrayList);


    }


//    private static class ItegerComparator implements Comparator<Integer> {
//
//        @Override
//        (Integer o1, Integer o2) -> {
//            return Integer.compare(o1, o2);
//        }
//
//
//
//    }


}
