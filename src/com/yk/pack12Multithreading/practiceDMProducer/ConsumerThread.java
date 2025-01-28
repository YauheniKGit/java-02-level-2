package com.yk.pack12Multithreading.practiceDMProducer;

import java.util.List;

public class ConsumerThread implements Runnable {

    private final List<Integer> linkedList;

    public ConsumerThread(List<Integer> linkedList) {
        this.linkedList = linkedList;
    }

    public void consume() {
        if (!linkedList.isEmpty()) {
            Integer removedElement = linkedList.remove(0);
            System.out.println("Element removed - " + removedElement);
            System.out.println("Size of the list is (Consume) - " + linkedList.size());
        }else {
            System.out.println("Consumer: list is empty");
        }
    }

    @Override
    public void run() {
        synchronized (linkedList) {
            while (true) {
                consume();
                try {
//                    linkedList.notifyAll();
                    linkedList.wait(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//
            }
        }
    }

}
