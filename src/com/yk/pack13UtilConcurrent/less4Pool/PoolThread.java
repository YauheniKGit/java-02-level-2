package com.yk.pack13UtilConcurrent.less4Pool;

import java.util.Optional;
import java.util.Queue;

public class PoolThread extends Thread{

    private final Queue<Runnable> tasks;

    public PoolThread(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (true){
            Optional<Runnable> task = Optional.empty();
        }

    }
}
