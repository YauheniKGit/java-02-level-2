package com.yk.pack12Multithreading.taskDMCounter;

public class Counter {
    private int count;

    public synchronized void increment() {

            count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

}
