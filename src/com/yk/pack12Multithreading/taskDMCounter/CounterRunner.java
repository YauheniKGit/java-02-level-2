package com.yk.pack12Multithreading.taskDMCounter;

public class CounterRunner {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread0 = new Thread(new CounterRunnable(counter));
        Thread thread1 = new Thread(new CounterRunnable(counter));
        Thread thread2 = new Thread(new CounterRunnable(counter));
        Thread thread3 = new Thread(new CounterRunnable(counter));

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(counter.getCount());

    }

}
