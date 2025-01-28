package com.yk.pack9FuncProg;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestAnonymClass {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Random().nextInt(1, 10));
        }

        int sumResult = 0;
        int multiplyResult = 1;
        String intString = "";

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.size() > 20) {
                sumResult += arrayList.get(i);
            } else if (arrayList.size() > 10 && arrayList.size() < 20) {
                intString += arrayList.get(i);
            } else {
                multiplyResult *= arrayList.get(i);
            }
        }

        System.out.println(sumResult);
        System.out.println(intString);
        System.out.println(multiplyResult);

    }

}
