package com.yk.pack12Multithreading;

public class ThreadExample extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 100 ; i++) {
            System.out.println("ThreadCLass run() method " + "Thread name is: " + getName());
        }

    }

}
