package com.yk.pack8Exceptions;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class Less46Practice {

    private static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new RuntimeException(),
            1, new FileNotFoundException(),
            2, new IndexOutOfBoundsException()
    );

    public static void main(String[] args) {

        Less46Practice less46Practice = new Less46Practice();

        try {
            task4(new Random().nextInt(3));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }

    public void task1() {
        String string = null;
        string.length();
    }

    public void task2() {
        int[] array1D = new int[5];
//        int value = array1D[5];
        for (int i = 0; i <= array1D.length; i++) {
            System.out.println(array1D[i]);
        }
    }

    public void task3(boolean isException) throws IllegalArgumentException {
        if (isException) {
            throw new IllegalArgumentException("Ooooops");
        }

    }

    public static void task4(int randomValue) throws Throwable {
        Throwable exceptionsOrDefault = EXCEPTIONS.getOrDefault(randomValue, new Less46CustomException());
        throw exceptionsOrDefault;
    }

}

