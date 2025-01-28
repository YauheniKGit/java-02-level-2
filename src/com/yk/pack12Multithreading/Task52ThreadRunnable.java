package com.yk.pack12Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;

public class Task52ThreadRunnable implements Runnable {

    private String name;

    public Task52ThreadRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        List<Integer> arrayList = new ArrayList<>();


        for (int i = 0; i <= 10; i++) {
            int randomValue = new Random().nextInt(1, 100);
            arrayList.add(randomValue);
        }

        OptionalDouble average = arrayList
                .stream()
                .mapToInt(a -> a)
                .average();

        System.out.println("Thread name - " + name + " average " + average);
    }

}
