package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable{
    private String name;
    ThreadPool(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + name);
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i=0;i<10;i++){
            executor.execute(new ThreadPool(" " + i));
        }
        executor.shutdown();

    }
}
