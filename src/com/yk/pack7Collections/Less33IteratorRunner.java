package com.yk.pack7Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Less33IteratorRunner {

    public static void main(String[] args) {
        List<Integer> sourceList = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> arrayList = new ArrayList<>(sourceList);
        List<Integer> linkedList = new LinkedList<>(sourceList);

        for (Integer list : sourceList) {
            System.out.println(list);
        }


    }

}
