package com.yk.pack12Multithreading;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("run() " + Thread.currentThread().getName() + " running");
    }

}
