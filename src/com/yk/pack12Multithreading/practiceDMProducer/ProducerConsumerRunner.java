package com.yk.pack12Multithreading.practiceDMProducer;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerRunner {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> linkedList = new LinkedList<>();

        Thread threadProducerThread = new Thread(new ProducerThread(linkedList));
        Thread threadConsumerThread = new Thread(new ConsumerThread(linkedList));

        threadProducerThread.start();
        threadConsumerThread.start();

        threadProducerThread.join();
        threadConsumerThread.join();



    }



}
