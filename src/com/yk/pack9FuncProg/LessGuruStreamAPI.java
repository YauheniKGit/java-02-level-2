package com.yk.pack9FuncProg;

import java.util.Arrays;
import java.util.List;

public class LessGuruStreamAPI {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");
        List<String> listEmpty = Arrays.asList();

        long count = list.stream().filter("a1"::equals).count();
        System.out.println(count);

        String firstElement = list.stream().findFirst().orElse("0");
        System.out.println(firstElement);

        String lastElement = list.stream().skip(list.size() - 1).findFirst().orElse("Empty");
        System.out.println(lastElement);

        String string = list.stream().filter("a3"::equals).findFirst().get();
        System.out.printf("a3 element: %s %n", string);

        String thirdElement = list.stream().skip(2).findFirst().get();
        System.out.printf("thirdElement: %s %n", thirdElement);

        List<String> result = list.stream().skip(1).limit(2).toList();
        System.out.println(result);
    }




}
