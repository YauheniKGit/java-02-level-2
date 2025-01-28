package com.yk.pack12Multithreading.cash;

import java.util.Queue;

public class BuyerThread implements Runnable {

    private final Queue<CashBox> cashBoxes;

    public BuyerThread(Queue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
            synchronized (cashBoxes) {
                while (true) {
                    if (!cashBoxes.isEmpty()) {
                        CashBox cashBox = cashBoxes.remove();
                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashBox);

                        cashBoxes.wait(5000L);

                        System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashBox);
                        cashBoxes.add(cashBox);
                        cashBoxes.notifyAll();
                        System.out.println();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу");
                        cashBoxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
