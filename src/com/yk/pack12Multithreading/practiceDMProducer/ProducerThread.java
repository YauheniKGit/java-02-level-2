package com.yk.pack12Multithreading.practiceDMProducer;

import java.util.List;
import java.util.Random;

public class ProducerThread implements Runnable {

    private final List<Integer> linkedList;

    public ProducerThread(List<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public void produce() {

        if (linkedList.size() <= 9) {
            int elementGenerated = new Random().nextInt(1, 100);
            linkedList.add(elementGenerated);
            System.out.println("Element added - " + elementGenerated);
            System.out.println("Size of the list is (Produce) - " + linkedList.size());
        }else{
            System.out.println("Producer does nothing");
        }
    }

    @Override
    public void run() {
        synchronized (linkedList) {
            while (true) {
                produce();
                try {
                    linkedList.wait(1000);
//                    linkedList.notifyAll();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
