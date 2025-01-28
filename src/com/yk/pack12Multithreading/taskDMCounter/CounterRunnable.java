package com.yk.pack12Multithreading.taskDMCounter;

public class CounterRunnable implements Runnable {

    private final Counter counter;

    public CounterRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            counter.increment();
        }
    }
}
