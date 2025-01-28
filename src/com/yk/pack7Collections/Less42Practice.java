package com.yk.pack7Collections;

import java.util.*;

public class Less42Practice {

    public static void main(String[] args) {

        Less42Practice less42Practice = new Less42Practice();

        //Task1
//        ProducerThread<Integer> list = ProducerThread.of(1, 3, 6, 8, 9, 13, 20);
//        ProducerThread<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 13, 20));
//        System.out.println(less42Practice.removeEvenNumbers(arrayList));

        //Task2
//        ProducerThread<Integer> integers = ProducerThread.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
//        ProducerThread<Integer> listEmpty = ProducerThread.of();
//        System.out.println(less42Practice.countUnique(integers));

        //Task3
        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins");

        System.out.println(less42Practice.isUnique(map));

    }


    private List<Integer> removeEvenNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            if (element % 2 != 0) {
                result.add(element);
            }
        }
        return result;
    }

    private int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }

    private boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<String>(map.values()).size();
    }


}
