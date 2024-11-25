package com.yk.pack5OOPPrinciples;

import java.util.Random;

public interface Printable {

    String SOME_VALUE = "Example";
    Random RANDOM = new Random();

    default void printWithRandom() {
        System.out.println(RANDOM.nextInt());
        print();
    }

    void print();

}
