package com.yk.pack13UtilConcurrent.less4Pool;

import java.util.concurrent.*;

public class PoolExample {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        Future<Integer> future = threadPool.submit(() -> {
            System.out.println("It's callable");
            return 1;
        });

        System.out.println("Result" + future.get());

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");


    }


}
